.class public Lo/agl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahm;


# static fields
.field private static final a:Ljava/lang/Object;

.field private static e:Lo/agl;


# instance fields
.field private b:Z

.field private c:Lo/afg;

.field private d:Lo/alk$e;

.field private h:Ljava/lang/String;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/agl;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agl;->b:Z

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agl;->h:Ljava/lang/String;

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agl;->i:Z

    .line 67
    return-void
.end method

.method static synthetic b(Lo/agl;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/agl;->h:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 7

    .line 379
    new-instance v6, Lo/agk;

    const v0, 0xc351

    invoke-direct {v6, v0}, Lo/agk;-><init>(I)V

    .line 380
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    new-instance v2, Lo/agk;

    const v3, 0xc351

    invoke-direct {v2, v3}, Lo/agk;-><init>(I)V

    iget-object v3, p0, Lo/agl;->c:Lo/afg;

    new-instance v4, Lo/agl$1;

    invoke-direct {v4, p0, v6}, Lo/agl$1;-><init>(Lo/agl;Lo/agk;)V

    iget-object v5, p0, Lo/agl;->d:Lo/alk$e;

    invoke-virtual/range {v0 .. v5}, Lo/afd;->d(Lo/acl$a;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)Ljava/lang/String;

    .line 448
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 218
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_0

    .line 219
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Measure failed,the bluetooth is off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 225
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 226
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 227
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 228
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeasureHelper sendMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    const-string v0, "PluginDevice_PluginDevice"

    invoke-static {v0, v4}, Lo/ahj;->d(Ljava/lang/String;Landroid/os/Message;)V

    .line 231
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 333
    iput-object p1, p0, Lo/agl;->h:Ljava/lang/String;

    .line 334
    invoke-static {p1}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    return-void

    .line 338
    :cond_0
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v2

    .line 339
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    const-string v1, "54C9739F-CA5C-4347-9F00-75B9DDF2C649"

    invoke-virtual {v0, v1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v3

    .line 341
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 342
    return-void

    .line 345
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/hihealth/device/open/MeasureKit;->getMeasureController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v4

    .line 347
    if-eqz v4, :cond_2

    .line 348
    new-instance v0, Lo/agl$4;

    invoke-direct {v0, p0}, Lo/agl$4;-><init>(Lo/agl;)V

    .line 371
    invoke-static {}, Lo/ahd;->a()Landroid/os/Bundle;

    move-result-object v1

    .line 348
    invoke-interface {v4, v2, v0, v1}, Lcom/huawei/hihealth/device/open/MeasureController;->prepare(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    .line 373
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/agl;)Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lo/agl;->i:Z

    return v0
.end method

.method static synthetic c(Lo/agl;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lo/agl;->b()V

    return-void
.end method

.method static synthetic c(Lo/agl;Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/agl;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/agl;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/agl;->h:Ljava/lang/String;

    return-object v0
.end method

.method public static e()Lo/agl;
    .locals 3

    .line 60
    sget-object v1, Lo/agl;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 61
    :try_start_0
    sget-object v0, Lo/agl;->e:Lo/agl;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Lo/agl;

    invoke-direct {v0}, Lo/agl;-><init>()V

    sput-object v0, Lo/agl;->e:Lo/agl;

    .line 64
    :cond_0
    sget-object v0, Lo/agl;->e:Lo/agl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 65
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic e(Lo/agl;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/agl;->i:Z

    return p1
.end method


# virtual methods
.method public a(Landroid/content/Context;ILo/acl$a;Lo/alk$e;)Ljava/lang/String;
    .locals 8

    .line 132
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeasureHelper startMeasureBackground with userId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",kind: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    if-eq p3, v0, :cond_1

    .line 135
    if-eqz p4, :cond_0

    .line 136
    sget-object v0, Lo/alk$c;->e:Lo/alk$c;

    invoke-interface {p4, v0}, Lo/alk$e;->b(Lo/alk$c;)V

    .line 139
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMeasureBackground failed, no suitable kit."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v0, 0x0

    return-object v0

    .line 143
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v4

    .line 144
    invoke-virtual {v4, p3}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v5

    .line 145
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    .line 146
    if-eqz p4, :cond_2

    .line 147
    sget-object v0, Lo/alk$c;->b:Lo/alk$c;

    invoke-interface {p4, v0}, Lo/alk$e;->b(Lo/alk$c;)V

    .line 149
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Measure failed, no device bonded for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const/4 v0, 0x0

    return-object v0

    .line 154
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 155
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 156
    const/4 v0, 0x0

    if-eq v0, p4, :cond_4

    .line 157
    invoke-interface {p4, v6}, Lo/alk$e;->b(Ljava/lang/String;)V

    .line 159
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Found 1 product, ID: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 162
    invoke-direct {p0, v6}, Lo/agl;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 164
    :cond_5
    invoke-virtual {v4, v6}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v7

    .line 165
    if-nez v7, :cond_7

    .line 166
    if-eqz p4, :cond_6

    .line 167
    sget-object v0, Lo/alk$c;->b:Lo/alk$c;

    invoke-interface {p4, v0}, Lo/alk$e;->b(Lo/alk$c;)V

    .line 169
    :cond_6
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Measure failed, getBondedDevice returned null:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v0, 0x0

    return-object v0

    .line 173
    :cond_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startMeasureBackground with product: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    const-string v0, "PluginDevice_PluginDevice"

    invoke-static {v0, p0}, Lo/ahj;->c(Ljava/lang/String;Lo/ahm;)V

    .line 177
    invoke-direct {p0, p1, v6}, Lo/agl;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 180
    :goto_0
    return-object v6

    .line 183
    :cond_8
    iput-object p4, p0, Lo/agl;->d:Lo/alk$e;

    .line 185
    const-string v0, "PluginDevice_PluginDevice"

    invoke-static {v0, p0}, Lo/ahj;->c(Ljava/lang/String;Lo/ahm;)V

    .line 187
    const-string v0, "unknown_device"

    invoke-direct {p0, p1, v0}, Lo/agl;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 189
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 235
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->l(Ljava/lang/String;)V

    .line 237
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->m(Ljava/lang/String;)V

    goto :goto_0

    .line 239
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 241
    :goto_0
    return-void
.end method

.method public b(Landroid/os/Message;)V
    .locals 8

    .line 256
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MeasureHelper handleMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    if-nez p1, :cond_0

    .line 259
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MeasureHelper message is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-void

    .line 262
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 264
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 265
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 266
    const-string v0, "PluginDevice_PluginDevice"

    invoke-static {v0, p0}, Lo/ahj;->b(Ljava/lang/String;Lo/ahm;)V

    .line 267
    const-string v0, "cancelEnableBluetooth"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MeasureHelper message is cancelEnableBluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 270
    :cond_1
    new-instance v7, Lo/agk;

    const v0, 0xc351

    invoke-direct {v7, v0}, Lo/agk;-><init>(I)V

    .line 271
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    new-instance v2, Lo/agk;

    const v3, 0xc351

    invoke-direct {v2, v3}, Lo/agk;-><init>(I)V

    iget-object v3, p0, Lo/agl;->c:Lo/afg;

    new-instance v4, Lo/agl$5;

    invoke-direct {v4, p0, v7}, Lo/agl$5;-><init>(Lo/agl;Lo/agk;)V

    iget-object v5, p0, Lo/agl;->d:Lo/alk$e;

    invoke-virtual/range {v0 .. v5}, Lo/afd;->d(Lo/acl$a;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)Ljava/lang/String;

    .line 320
    .line 326
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Lo/afg;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/agl;->c:Lo/afg;

    .line 71
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 455
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v2

    .line 456
    const-string v0, "48"

    invoke-virtual {v2}, Lo/afj;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "57"

    invoke-virtual {v2}, Lo/afj;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 457
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agl;->b:Z

    goto :goto_0

    .line 459
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agl;->b:Z

    .line 461
    :goto_0
    return-void
.end method

.method public c()Z
    .locals 1

    .line 451
    iget-boolean v0, p0, Lo/agl;->b:Z

    return v0
.end method

.method public d()V
    .locals 1

    .line 464
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agl;->b:Z

    .line 465
    return-void
.end method
