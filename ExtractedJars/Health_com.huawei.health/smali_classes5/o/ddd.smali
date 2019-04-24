.class public Lo/ddd;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static c:Lo/ddd;


# instance fields
.field private a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private b:Landroid/content/Context;

.field private d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private e:Lo/dde;

.field private final f:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 59
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 154
    new-instance v0, Lo/ddd$2;

    invoke-direct {v0, p0}, Lo/ddd$2;-><init>(Lo/ddd;)V

    iput-object v0, p0, Lo/ddd;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 307
    new-instance v0, Lo/ddd$4;

    invoke-direct {v0, p0}, Lo/ddd$4;-><init>(Lo/ddd;)V

    iput-object v0, p0, Lo/ddd;->f:Landroid/content/BroadcastReceiver;

    .line 60
    iput-object p1, p0, Lo/ddd;->b:Landroid/content/Context;

    .line 61
    iget-object v0, p0, Lo/ddd;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/ddd;->e:Lo/dde;

    .line 62
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    iget-object v1, p0, Lo/ddd;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 66
    :cond_0
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceFontManager() hwDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    :goto_0
    invoke-direct {p0}, Lo/ddd;->e()V

    .line 71
    return-void
.end method

.method static synthetic b(Lo/ddd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ddd;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic b(Lo/ddd;[B)[Ljava/lang/String;
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/ddd;->e([B)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c([B)Lo/dba;
    .locals 9

    .line 240
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getTLVList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 242
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const/4 v0, 0x0

    return-object v0

    .line 245
    :cond_0
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 246
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 247
    new-instance v6, Lo/daz;

    invoke-direct {v6}, Lo/daz;-><init>()V

    .line 248
    const/4 v7, 0x0

    .line 250
    :try_start_0
    invoke-virtual {v6, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 253
    goto :goto_0

    .line 251
    :catch_0
    move-exception v8

    .line 252
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resloveWatchStatus TLVException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :goto_0
    return-object v7
.end method

.method public static c(Landroid/content/Context;)Lo/ddd;
    .locals 4

    .line 51
    sget-object v0, Lo/ddd;->c:Lo/ddd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 52
    const-string v0, "HWDeviceFontManager"

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    new-instance v0, Lo/ddd;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ddd;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ddd;->c:Lo/ddd;

    .line 55
    :cond_0
    sget-object v0, Lo/ddd;->c:Lo/ddd;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 280
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerUnitRefreshBroadcast():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.REFRESH_UNIT"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 282
    const-string v0, "com.huawei.bone.action.REFRESH_UNIT"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 283
    iget-object v0, p0, Lo/ddd;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 284
    iget-object v0, p0, Lo/ddd;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ddd;->f:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 286
    :cond_0
    return-void
.end method

.method private e([B)[Ljava/lang/String;
    .locals 10

    .line 207
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter parseDeviceFontInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    invoke-direct {p0, p1}, Lo/ddd;->c([B)Lo/dba;

    move-result-object v6

    .line 210
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 211
    const/4 v0, 0x0

    return-object v0

    .line 214
    :cond_0
    iget-object v7, v6, Lo/dba;->e:Ljava/util/List;

    .line 215
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 216
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the case is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 220
    :sswitch_0
    :try_start_0
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 221
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEVICE_FONT_STURCT TAG = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    if-nez v9, :cond_1

    .line 223
    const/4 v0, 0x0

    return-object v0

    .line 225
    :cond_1
    const-string v0, ","

    :try_start_1
    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v5

    .line 226
    return-object v5

    .line 227
    :catch_0
    move-exception v9

    .line 228
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "message = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    goto :goto_2

    .line 232
    :goto_1
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEVICE_FONT_STURCT TAG = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 236
    :cond_2
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public a()V
    .locals 15

    .line 79
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceLanguage()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 81
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v4

    .line 82
    if-nez v4, :cond_0

    .line 83
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceLanguage() list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void

    .line 86
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 87
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 88
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 89
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isLanguage()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 90
    new-instance v8, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v8}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 91
    const/16 v0, 0xc

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 92
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 93
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 94
    invoke-static {}, Lo/dbf;->g()Ljava/lang/String;

    move-result-object v9

    .line 95
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendLanguage is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-static {v9}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v10

    .line 99
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 103
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x7

    if-eq v1, v0, :cond_2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xe

    if-eq v1, v0, :cond_2

    .line 104
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Need set unit info."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const/4 v11, 0x1

    .line 107
    invoke-static {}, Lo/cxh;->a()Z

    move-result v13

    .line 108
    if-eqz v13, :cond_1

    .line 109
    const/4 v12, 0x1

    .line 111
    :cond_1
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unit info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :cond_2
    const/4 v13, 0x0

    .line 115
    if-eqz v11, :cond_3

    .line 117
    array-length v0, v10

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v13, v0, 0x3

    goto :goto_1

    .line 120
    :cond_3
    array-length v0, v10

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v13, v0, 0x1

    .line 124
    :goto_1
    invoke-static {v13}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v14

    .line 126
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 128
    array-length v0, v10

    int-to-byte v0, v0

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 130
    invoke-virtual {v14, v10}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 132
    if-eqz v11, :cond_4

    .line 133
    const/4 v0, 0x2

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 134
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 136
    int-to-byte v0, v12

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 139
    :cond_4
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 140
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 141
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDeviceLanguage(): Command = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v3

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v3

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

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

    .line 142
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    invoke-virtual {v0, v8}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 145
    :cond_5
    goto/16 :goto_0

    .line 147
    :cond_6
    return-void
.end method

.method public b()V
    .locals 4

    .line 259
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 260
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend()  send command begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-virtual {p0}, Lo/ddd;->a()V

    goto :goto_0

    .line 263
    :cond_0
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    :goto_0
    return-void
.end method

.method public d()V
    .locals 8

    .line 182
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 183
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 184
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 186
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 188
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 191
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 196
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 197
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceFontInfo deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lo/ddd;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 199
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 150
    const-string v0, "HWDeviceFontManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iput-object p1, p0, Lo/ddd;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 152
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 75
    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onDestroy()V
    .locals 0

    .line 269
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 273
    return-void
.end method
