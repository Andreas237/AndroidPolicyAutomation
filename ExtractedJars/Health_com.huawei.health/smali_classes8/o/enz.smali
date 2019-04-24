.class public Lo/enz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile f:Lo/enz;


# instance fields
.field a:Lo/dez;

.field b:Lo/dpb;

.field c:Lo/dde;

.field d:Lo/dhd;

.field e:Lo/cwf;

.field g:Z

.field private h:Lo/ddw;

.field i:Lo/dpa;

.field k:Lo/djj;

.field private l:Landroid/content/Context;

.field private m:I

.field private p:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const/4 v0, 0x0

    sput-object v0, Lo/enz;->f:Lo/enz;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->c:Lo/dde;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->d:Lo/dhd;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->a:Lo/dez;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->e:Lo/cwf;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->b:Lo/dpb;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->i:Lo/dpa;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enz;->k:Lo/djj;

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enz;->g:Z

    .line 650
    new-instance v0, Lo/enz$5;

    invoke-direct {v0, p0}, Lo/enz$5;-><init>(Lo/enz;)V

    iput-object v0, p0, Lo/enz;->p:Landroid/os/Handler;

    .line 742
    const/4 v0, 0x0

    iput v0, p0, Lo/enz;->m:I

    .line 96
    iput-object p1, p0, Lo/enz;->l:Landroid/content/Context;

    .line 97
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->c:Lo/dde;

    .line 98
    invoke-static {}, Lo/dhd;->a()Lo/dhd;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->d:Lo/dhd;

    .line 99
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->a:Lo/dez;

    .line 100
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->e:Lo/cwf;

    .line 101
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->b:Lo/dpb;

    .line 102
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->i:Lo/dpa;

    .line 103
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/djj;->d(Landroid/content/Context;)Lo/djj;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->k:Lo/djj;

    .line 104
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/ddw;->b(Landroid/content/Context;)Lo/ddw;

    move-result-object v0

    iput-object v0, p0, Lo/enz;->h:Lo/ddw;

    .line 105
    return-void
.end method

.method static synthetic a(Lo/enz;I)I
    .locals 0

    .line 58
    iput p1, p0, Lo/enz;->m:I

    return p1
.end method

.method public static b(Landroid/content/Context;)Lo/enz;
    .locals 4

    .line 108
    sget-object v0, Lo/enz;->f:Lo/enz;

    if-nez v0, :cond_1

    .line 109
    const-class v2, Lo/enz;

    monitor-enter v2

    .line 110
    :try_start_0
    sget-object v0, Lo/enz;->f:Lo/enz;

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Lo/enz;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/enz;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/enz;->f:Lo/enz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 116
    :cond_1
    :goto_0
    sget-object v0, Lo/enz;->f:Lo/enz;

    return-object v0
.end method

.method static synthetic c(Lo/enz;)Landroid/content/Context;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/enz;)I
    .locals 1

    .line 58
    iget v0, p0, Lo/enz;->m:I

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 635
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceName by id"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 637
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 639
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;"
        }
    .end annotation

    .line 369
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceEventAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cwf;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 5

    .line 707
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushWeatherData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 710
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no device so do not start PhoneService."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    return-void

    .line 713
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 714
    const-string v0, "com.huawei.health.ACTION_WEATHER_DATA_PUSH"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 716
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to push weather data msg."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 718
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 830
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v4

    .line 831
    if-eqz v4, :cond_0

    if-nez p2, :cond_1

    .line 832
    :cond_0
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getNoDisturbInfo() hwDeviceConfigManager == null || callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 833
    return-void

    .line 836
    :cond_1
    invoke-virtual {v4, p2}, Lo/dde;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 837
    return-void
.end method

.method public a(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 248
    iget-object v0, p0, Lo/enz;->h:Lo/ddw;

    invoke-virtual {v0, p1, p2, p3}, Lo/ddw;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 249
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 342
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceEventAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cwf;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 344
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 405
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/cwf;->c(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 406
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;)V"
        }
    .end annotation

    .line 391
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 393
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 394
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveEventAlarmList json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_SMART_ALARM_INFO"

    invoke-static {v0, v1, v2, v5, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 399
    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 273
    iget-object v0, p0, Lo/enz;->a:Lo/dez;

    invoke-virtual {v0, p1}, Lo/dez;->a(Z)V

    .line 274
    return-void
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 4

    .line 123
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceCapabilityNegotiation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 4

    .line 131
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceCapabilityNegotiation(id)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-static {p1}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 5

    .line 1024
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "push data to device: (5.32.9)------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1025
    invoke-static {}, Lo/djo;->c()Lo/djo;

    move-result-object v4

    .line 1026
    invoke-virtual {v4, p1}, Lo/djo;->e(I)V

    .line 1027
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 917
    invoke-static {p1}, Lo/djj;->d(Landroid/content/Context;)Lo/djj;

    move-result-object v4

    .line 918
    if-nez v4, :cond_0

    .line 919
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOneLevelMenu() hwOneLevelMenuManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    return-void

    .line 922
    :cond_0
    invoke-virtual {v4, p2, p3}, Lo/djj;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 923
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 929
    invoke-static {p1}, Lo/djj;->d(Landroid/content/Context;)Lo/djj;

    move-result-object v4

    .line 930
    if-eqz v4, :cond_0

    if-nez p3, :cond_1

    .line 931
    :cond_0
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwOneLevelMenuManager == null || list == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    return-void

    .line 935
    :cond_1
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "before list.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    invoke-virtual {v4, p2, p3, p4}, Lo/djj;->d(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 939
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 187
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDevicePhoneInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 189
    return-void
.end method

.method public b(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 1

    .line 776
    new-instance v0, Lo/enz$4;

    invoke-direct {v0, p0, p2}, Lo/enz$4;-><init>(Lo/enz;Landroid/os/Handler;)V

    invoke-virtual {p0, p1, v0}, Lo/enz;->c(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 788
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 360
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceSmartAlarmList()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cwf;->c(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 362
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/cwf;->d(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 412
    return-void
.end method

.method public b(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 142
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setAutoLightScreenSwitchStatus() Status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/dde;->d(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 144
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;)V"
        }
    .end annotation

    .line 436
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 438
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 439
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/EventAlarmInfo;

    .line 441
    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 442
    invoke-virtual {v6, v6, v5}, Lcom/huawei/datatype/EventAlarmInfo;->resetAlarm(Lcom/huawei/datatype/EventAlarmInfo;I)Lcom/huawei/datatype/EventAlarmInfo;

    move-result-object v6

    .line 469
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 473
    :cond_1
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarm saveAlarmInfoList.size() = "

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

    .line 475
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 479
    :try_start_0
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 481
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 482
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarm saveOnceAlarm() json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2, v6, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 489
    goto :goto_1

    .line 487
    :catch_0
    move-exception v5

    .line 488
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarm saveOnceAlarm() setSharedPreference error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    :cond_2
    :goto_1
    return-void
.end method

.method public b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 420
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEventAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/cwf;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 428
    invoke-virtual {p0, p1}, Lo/enz;->b(Ljava/util/List;)V

    .line 429
    return-void
.end method

.method public b(Z)Z
    .locals 5

    .line 207
    if-eqz p1, :cond_0

    .line 208
    iget-object v0, p0, Lo/enz;->i:Lo/dpa;

    invoke-virtual {v0}, Lo/dpa;->d()Z

    move-result v4

    goto :goto_0

    .line 210
    :cond_0
    iget-object v0, p0, Lo/enz;->b:Lo/dpb;

    invoke-virtual {v0}, Lo/dpb;->c()Z

    move-result v4

    .line 212
    :goto_0
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNew"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isAW70 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    return v4
.end method

.method public c(Landroid/content/Context;)I
    .locals 5

    .line 904
    invoke-static {p1}, Lo/cvw;->e(Landroid/content/Context;)Lo/cvw;

    move-result-object v4

    .line 905
    if-nez v4, :cond_0

    .line 906
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwAddressBookManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    const/4 v0, 0x0

    return v0

    .line 910
    :cond_0
    invoke-virtual {v4}, Lo/cvw;->e()I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 4

    .line 794
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleRestoreFactorySuccess()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 844
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v4

    .line 845
    if-eqz v4, :cond_0

    if-nez p3, :cond_1

    .line 846
    :cond_0
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNoDisturb2Device() hwDeviceConfigManager == null || mDataDeviceAvoidDisturbInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    return-void

    .line 850
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 851
    invoke-interface {v5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 854
    const/4 v0, 0x0

    invoke-virtual {v4, p2, v5, p4, v0}, Lo/dde;->e(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 855
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 252
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityReminder()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lo/enz;->a:Lo/dez;

    invoke-virtual {v0, p1}, Lo/dez;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 254
    return-void
.end method

.method public c(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 222
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "factoryReset()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    invoke-virtual {v0, p1, p2}, Lo/dde;->c(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 224
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 283
    iget-object v0, p0, Lo/enz;->a:Lo/dez;

    invoke-virtual {v0, p1, p2}, Lo/dez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    return-void
.end method

.method public c(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 168
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setRotateSwitchScreenSwitchStatus() Status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/dde;->a(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 170
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;)V"
        }
    .end annotation

    .line 543
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 545
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 546
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 548
    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 550
    invoke-virtual {v6, v6, v5}, Lcom/huawei/datatype/SmartAlarmInfo;->resetSmartAlarm(Lcom/huawei/datatype/SmartAlarmInfo;I)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v6

    .line 576
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 545
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 580
    :cond_1
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== saveOnceSmartAlarm saveAlarmInfoList.size() = "

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

    .line 582
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 586
    :try_start_0
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 588
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 589
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== saveOnceSmartAlarm() json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_SMART_ALARM_INFO"

    invoke-static {v0, v1, v2, v6, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 596
    goto :goto_1

    .line 594
    :catch_0
    move-exception v5

    .line 595
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== saveOnceSmartAlarm() setSharedPreference error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    :cond_2
    :goto_1
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 1033
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setPressAutoMonitorSwitch pressAutoMonitorSwitch = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1034
    invoke-static {}, Lo/djo;->c()Lo/djo;

    move-result-object v4

    .line 1035
    invoke-virtual {v4, p1}, Lo/djo;->b(Z)V

    .line 1036
    return-void
.end method

.method public c(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 152
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDeviceLeftOrRightHandStatus() Status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/dde;->c(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 158
    return-void
.end method

.method public d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 2

    .line 621
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 622
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 623
    return-object v1

    .line 625
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Landroid/content/Context;II)Ljava/lang/String;
    .locals 9

    .line 985
    const-string v4, ""

    .line 986
    const-string v5, ""

    .line 987
    invoke-static {p2}, Lo/dbu;->b(I)Ljava/lang/String;

    move-result-object v6

    .line 988
    invoke-static {p3}, Lo/dbu;->b(I)Ljava/lang/String;

    move-result-object v7

    .line 989
    invoke-virtual {p0, v6}, Lo/enz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 990
    if-le p2, p3, :cond_0

    .line 991
    invoke-virtual {p0, v7}, Lo/enz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 992
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_no_disturb_setting_next_day:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 993
    goto :goto_0

    .line 994
    :cond_0
    invoke-virtual {p0, v7}, Lo/enz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 996
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1004
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v4

    .line 1006
    :try_start_0
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1007
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 1008
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 1009
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object p1, v0

    .line 1010
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOffsetTimeStr dateFormat time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1013
    goto :goto_0

    .line 1011
    :catch_0
    move-exception v5

    .line 1012
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e.getMessage() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1014
    :goto_0
    return-object p1
.end method

.method public d(I)V
    .locals 1

    .line 301
    iget-object v0, p0, Lo/enz;->a:Lo/dez;

    invoke-virtual {v0, p1}, Lo/dez;->d(I)V

    .line 302
    return-void
.end method

.method public d(IIZ)V
    .locals 1

    .line 310
    iget-object v0, p0, Lo/enz;->a:Lo/dez;

    invoke-virtual {v0, p1, p2, p3}, Lo/dez;->c(IIZ)V

    .line 311
    return-void
.end method

.method public d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 873
    invoke-static {p1}, Lo/cvw;->e(Landroid/content/Context;)Lo/cvw;

    move-result-object v4

    .line 874
    if-nez v4, :cond_0

    .line 875
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getContact() hwAddressBookManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 877
    return-void

    .line 880
    :cond_0
    invoke-virtual {v4, p2}, Lo/cvw;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 881
    return-void
.end method

.method public d(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/datatype/Contact;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 888
    invoke-static {p1}, Lo/cvw;->e(Landroid/content/Context;)Lo/cvw;

    move-result-object v4

    .line 889
    if-eqz v4, :cond_0

    if-nez p2, :cond_1

    .line 890
    :cond_0
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwAddressBookManager == null || list == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    return-void

    .line 894
    :cond_1
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "before list.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    const/4 v0, 0x0

    invoke-virtual {v4, p2, p3, v0}, Lo/cvw;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 898
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 2

    .line 750
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v1

    .line 752
    new-instance v0, Lo/enz$1;

    invoke-direct {v0, p0, p2}, Lo/enz$1;-><init>(Lo/enz;Landroid/os/Handler;)V

    invoke-virtual {v1, p1, v0}, Lo/env;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 770
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 263
    iget-object v0, p0, Lo/enz;->h:Lo/ddw;

    invoke-virtual {v0, p1, p2}, Lo/ddw;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 264
    return-void
.end method

.method public d(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 197
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setBluetoothOffalertSwitchStatus() Status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lo/enz;->d:Lo/dhd;

    invoke-virtual {v0, p1, p2, p3}, Lo/dhd;->e(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 199
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;)V"
        }
    .end annotation

    .line 377
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 379
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 380
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveEventAlarmList json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2, v5, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 385
    invoke-virtual {p0, p1}, Lo/enz;->b(Ljava/util/List;)V

    .line 386
    return-void
.end method

.method public d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 527
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSmartAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/cwf;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 535
    invoke-virtual {p0, p1}, Lo/enz;->c(Ljava/util/List;)V

    .line 536
    return-void
.end method

.method public d(Z)V
    .locals 5

    .line 724
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setWeatherReportUnit weatherReportUnit "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->c(Ljava/lang/String;)V

    .line 727
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 728
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no device so do not start PhoneService."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    return-void

    .line 731
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 732
    const-string v0, "com.huawei.health.ACTION_WEATHER_DATA_PUSH"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 734
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to push weather unit data msg."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 736
    return-void
.end method

.method public d(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 234
    new-instance v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;-><init>()V

    .line 235
    invoke-virtual {v1, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->setEnabled(Z)V

    .line 237
    iget-object v0, p0, Lo/enz;->a:Lo/dez;

    invoke-virtual {v0, v1, p2}, Lo/dez;->a(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 238
    return-void
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation

    .line 863
    invoke-static {p1}, Lo/cvw;->e(Landroid/content/Context;)Lo/cvw;

    move-result-object v4

    .line 864
    if-nez v4, :cond_0

    .line 865
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getContact() hwAddressBookManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    const/4 v0, 0x0

    return-object v0

    .line 869
    :cond_0
    invoke-virtual {v4}, Lo/cvw;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Object;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation

    .line 351
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEventAlarmList()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cwf;->c(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 5

    .line 691
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushLocalPressure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 694
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no device so do not start PhoneService."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    return-void

    .line 697
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 698
    const-string v0, "com.huawei.health.ACTION_LOCAL_PRESSURE_PUSH"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 700
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to push pushLocalPressure msg."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 701
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 702
    return-void
.end method

.method public e(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 178
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDeviceOperationStatus status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lo/enz;->c:Lo/dde;

    invoke-virtual {v0, p1, p2}, Lo/dde;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 180
    return-void
.end method

.method public e(Z)V
    .locals 6

    .line 669
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setWeatherReportSwitch weatherReportSwitch="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    iget-object v0, p0, Lo/enz;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->d(Ljava/lang/String;)V

    .line 672
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 673
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no device so do not start PhoneService."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 674
    return-void

    .line 676
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 677
    const-string v0, "com.huawei.health.ACTION_WEATHER_PUSH"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 678
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 679
    const-string v0, "com.huawei.health.ACTION_WEATHER_PUSH_VALUE"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 680
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 682
    const-string v0, "DeviceSettingsInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to push notification msg."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 684
    return-void
.end method
