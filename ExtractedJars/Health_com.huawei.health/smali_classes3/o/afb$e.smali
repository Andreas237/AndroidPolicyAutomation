.class Lo/afb$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/afb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field public a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

.field public b:Lo/abx;

.field final synthetic c:Lo/afb;

.field private d:Lo/acp;

.field private e:Lcom/huawei/hihealth/device/open/HealthDevice;

.field private f:Ljava/lang/String;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private h:Lcom/huawei/hihealth/device/open/MeasureController;

.field private i:Lo/afv;

.field private k:Landroid/os/Bundle;

.field private o:Lo/alk$e;

.field private p:Lo/afg;


# direct methods
.method public constructor <init>(Lo/afb;Ljava/util/ArrayList;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)V"
        }
    .end annotation

    .line 98
    iput-object p1, p0, Lo/afb$e;->c:Lo/afb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->b:Lo/abx;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->d:Lo/acp;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    .line 99
    iput-object p3, p0, Lo/afb$e;->b:Lo/abx;

    .line 100
    iput-object p4, p0, Lo/afb$e;->p:Lo/afg;

    .line 102
    iput-object p2, p0, Lo/afb$e;->g:Ljava/util/ArrayList;

    .line 103
    iput-object p6, p0, Lo/afb$e;->o:Lo/alk$e;

    .line 105
    iput-object p5, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    .line 106
    return-void
.end method

.method public constructor <init>(Lo/afb;Lo/acp;Lo/abx;Landroid/os/Bundle;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;)V
    .locals 1

    .line 86
    iput-object p1, p0, Lo/afb$e;->c:Lo/afb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->b:Lo/abx;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->d:Lo/acp;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    .line 87
    iput-object p3, p0, Lo/afb$e;->b:Lo/abx;

    .line 88
    iput-object p4, p0, Lo/afb$e;->k:Landroid/os/Bundle;

    .line 90
    iput-object p2, p0, Lo/afb$e;->d:Lo/acp;

    .line 91
    iput-object p5, p0, Lo/afb$e;->f:Ljava/lang/String;

    .line 93
    iput-object p7, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    .line 94
    iput-object p6, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    .line 95
    return-void
.end method

.method private a(ILandroid/os/Bundle;)Z
    .locals 10

    .line 311
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v4

    .line 312
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 313
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter start to measure mDeviceUniversal with productInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",km:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    invoke-virtual {v5}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    invoke-virtual {v5}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v6

    .line 316
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 317
    iget-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    iget-object v1, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;->onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V

    .line 320
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter no measure kit for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v3}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const/4 v0, 0x0

    return v0

    .line 323
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeasureKitUniversal uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hihealth/device/open/MeasureKit;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    invoke-virtual {v6}, Lcom/huawei/hihealth/device/open/MeasureKit;->getMeasureController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    iput-object v0, p0, Lo/afb$e;->h:Lcom/huawei/hihealth/device/open/MeasureController;

    .line 325
    iget-object v0, p0, Lo/afb$e;->h:Lcom/huawei/hihealth/device/open/MeasureController;

    if-eqz v0, :cond_6

    .line 327
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter current controllerUniversal is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->h:Lcom/huawei/hihealth/device/open/MeasureController;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    if-eqz v0, :cond_2

    .line 330
    iget-object v0, p0, Lo/afb$e;->h:Lcom/huawei/hihealth/device/open/MeasureController;

    iget-object v1, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    iget-object v2, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    iget-object v3, p0, Lo/afb$e;->k:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/hihealth/device/open/MeasureController;->prepare(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    .line 333
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current controller is 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    invoke-virtual {v6}, Lcom/huawei/hihealth/device/open/MeasureKit;->getBackgroundController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v7

    .line 337
    const/4 v8, 0x0

    .line 338
    if-eqz p2, :cond_3

    .line 339
    const-string v0, "isBackgroundMeasure"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    .line 342
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter current controller is flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    if-eqz v7, :cond_4

    if-nez v8, :cond_4

    const/4 v9, 0x1

    goto :goto_0

    :cond_4
    const/4 v9, 0x0

    .line 346
    :goto_0
    if-eqz v9, :cond_5

    .line 350
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device support background measure but use direct measure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_OCCUPIED"

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    invoke-direct {p0, p1}, Lo/afb$e;->c(I)Z

    move-result v0

    return v0

    .line 360
    :cond_5
    invoke-direct {p0, v7}, Lo/afb$e;->e(Lcom/huawei/hihealth/device/open/MeasureController;)V

    .line 361
    invoke-direct {p0, p1}, Lo/afb$e;->c(I)Z

    move-result v0

    return v0

    .line 365
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/afb$e;->h:Lcom/huawei/hihealth/device/open/MeasureController;

    return-object v0
.end method

.method private b(ILandroid/os/Bundle;)Z
    .locals 11

    .line 212
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v4

    .line 213
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter start to measure with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v3}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "kituuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v3}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    iget-object v0, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v0}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/acq;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v5

    .line 217
    const/4 v6, 0x1

    .line 218
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 219
    const/4 v6, 0x1

    goto :goto_0

    .line 221
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iget-object v0, v0, Lo/afj;->f:Lo/acf;

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v6

    .line 224
    :goto_0
    const/4 v0, 0x2

    if-eq v6, v0, :cond_1

    const/4 v0, 0x1

    if-ne v6, v0, :cond_3

    .line 225
    :cond_1
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    if-ne v0, v1, :cond_2

    .line 226
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device is heart rate device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 227
    :cond_2
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0}, Lo/acd;->f()Z

    move-result v0

    if-nez v0, :cond_3

    .line 228
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter failed to enable bluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    const/4 v0, 0x0

    return v0

    .line 233
    :cond_3
    :goto_1
    if-nez v5, :cond_4

    .line 234
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    iget-object v1, p0, Lo/afb$e;->d:Lo/acp;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/abx;->onFailed(Lo/acl;I)V

    .line 235
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter no measure kit for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v3}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const/4 v0, 0x0

    return v0

    .line 238
    :cond_4
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v7

    .line 239
    if-eqz v7, :cond_7

    .line 241
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->a:Lo/acl$a;

    if-ne v0, v1, :cond_5

    .line 242
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v8

    .line 243
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->a(Ljava/lang/String;)Lo/afz;

    move-result-object v9

    .line 244
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    invoke-interface {v0, v8, v9}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 245
    goto/16 :goto_3

    :cond_5
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    if-ne v0, v1, :cond_6

    .line 247
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v8

    .line 248
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->e(Ljava/lang/String;)Lo/afz;

    move-result-object v9

    .line 249
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    invoke-interface {v0, v8, v9}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 251
    goto/16 :goto_3

    :cond_6
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    if-ne v0, v1, :cond_b

    .line 252
    new-instance v8, Landroid/content/Intent;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 253
    const-string v0, "productId"

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 254
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 257
    goto/16 :goto_3

    .line 259
    :cond_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MeasureKit uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/afx;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v5}, Lo/afx;->e()Lo/afv;

    move-result-object v0

    iput-object v0, p0, Lo/afb$e;->i:Lo/afv;

    .line 261
    iget-object v0, p0, Lo/afb$e;->i:Lo/afv;

    if-eqz v0, :cond_b

    .line 263
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter current controller is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->i:Lo/afv;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iget-object v0, p0, Lo/afb$e;->i:Lo/afv;

    iget-object v1, p0, Lo/afb$e;->d:Lo/acp;

    iget-object v2, p0, Lo/afb$e;->b:Lo/abx;

    iget-object v3, p0, Lo/afb$e;->k:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 267
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current controller is 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    invoke-virtual {v5}, Lo/afx;->c()Lo/afv;

    move-result-object v8

    .line 271
    const/4 v9, 0x0

    .line 272
    if-eqz p2, :cond_8

    .line 273
    const-string v0, "isBackgroundMeasure"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    .line 276
    :cond_8
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter current controller is flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    if-eqz v8, :cond_9

    if-nez v9, :cond_9

    const/4 v10, 0x1

    goto :goto_2

    :cond_9
    const/4 v10, 0x0

    .line 280
    :goto_2
    if-eqz v10, :cond_a

    .line 284
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device support background measure but use direct measure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_OCCUPIED"

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    invoke-direct {p0, p1}, Lo/afb$e;->c(I)Z

    goto :goto_3

    .line 294
    :cond_a
    invoke-direct {p0, v8}, Lo/afb$e;->d(Lo/afv;)V

    .line 295
    invoke-direct {p0, p1}, Lo/afb$e;->c(I)Z

    move-result v0

    return v0

    .line 300
    :cond_b
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method private c(I)Z
    .locals 5

    .line 370
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    if-eqz v0, :cond_1

    .line 371
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter Try to connect "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v3}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    iget-object v0, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v0, p1}, Lo/acp;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 373
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter Fail to connect to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v3}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    iget-object v1, p0, Lo/afb$e;->d:Lo/acp;

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 376
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter Fail to connect, ending..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    iget-object v0, p0, Lo/afb$e;->i:Lo/afv;

    invoke-virtual {v0}, Lo/afv;->e()V

    .line 382
    const-wide/16 v0, 0xc8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 385
    goto :goto_0

    .line 383
    :catch_0
    move-exception v4

    .line 384
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter Fail to connect, cleanup..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lo/afb$e;->i:Lo/afv;

    invoke-virtual {v0}, Lo/afv;->d()V

    .line 389
    const/4 v0, 0x0

    return v0

    .line 391
    :cond_0
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    iget-object v1, p0, Lo/afb$e;->d:Lo/acp;

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 392
    iget-object v0, p0, Lo/afb$e;->i:Lo/afv;

    invoke-virtual {v0}, Lo/afv;->b()Z

    .line 393
    const/4 v0, 0x1

    return v0

    .line 394
    :cond_1
    iget-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    if-eqz v0, :cond_2

    .line 396
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter Try to connect "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v3}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter Try to connect address:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v3}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    iget-object v0, p0, Lo/afb$e;->h:Lcom/huawei/hihealth/device/open/MeasureController;

    invoke-interface {v0}, Lcom/huawei/hihealth/device/open/MeasureController;->start()Z

    .line 399
    const/4 v0, 0x1

    return v0

    .line 401
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private c(ILandroid/os/Bundle;)Z
    .locals 4

    .line 179
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter start to measure with mHealthCallback:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->b:Lo/abx;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mHealthCallbackUniversal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/afb$e;->b:Lo/abx;

    if-eqz v0, :cond_0

    .line 182
    invoke-direct {p0, p1, p2}, Lo/afb$e;->b(ILandroid/os/Bundle;)Z

    move-result v0

    return v0

    .line 183
    :cond_0
    iget-object v0, p0, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    if-eqz v0, :cond_1

    .line 184
    invoke-direct {p0, p1, p2}, Lo/afb$e;->a(ILandroid/os/Bundle;)Z

    move-result v0

    return v0

    .line 186
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lo/afv;)V
    .locals 4

    .line 190
    if-eqz p1, :cond_0

    .line 191
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device use background measure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 193
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device use direct measure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/afb$e;)Lo/afv;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/afb$e;->i:Lo/afv;

    return-object v0
.end method

.method private e(Lcom/huawei/hihealth/device/open/MeasureController;)V
    .locals 4

    .line 202
    if-eqz p1, :cond_0

    .line 203
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device use background measure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 205
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device use direct measure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 110
    iget-object v0, p0, Lo/afb$e;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lo/afb$e;->k:Landroid/os/Bundle;

    const/16 v1, 0x1e

    invoke-direct {p0, v1, v0}, Lo/afb$e;->c(ILandroid/os/Bundle;)Z

    goto/16 :goto_3

    .line 113
    :cond_0
    iget-object v0, p0, Lo/afb$e;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    :goto_0
    if-ltz v4, :cond_9

    .line 114
    iget-object v0, p0, Lo/afb$e;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/afb$e;->f:Ljava/lang/String;

    .line 115
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    iput-object v0, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb$e;->b:Lo/abx;

    .line 118
    invoke-static {}, Lo/ahd;->a()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lo/afb$e;->k:Landroid/os/Bundle;

    goto :goto_1

    .line 120
    :cond_1
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v0

    iput-object v0, p0, Lo/afb$e;->d:Lo/acp;

    .line 121
    iget-object v0, p0, Lo/afb$e;->d:Lo/acp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 122
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter current device is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v2}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/afb$e;->d:Lo/acp;

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    if-nez v0, :cond_3

    .line 127
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter mDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void

    .line 131
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter current productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v0, p0, Lo/afb$e;->d:Lo/acp;

    instance-of v0, v0, Lo/aco;

    if-eqz v0, :cond_5

    .line 134
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 135
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter bluetooth is disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    goto/16 :goto_3

    .line 138
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter current device is dummyDevice"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v3}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lo/afb$e;->p:Lo/afg;

    iget-object v1, p0, Lo/afb$e;->d:Lo/acp;

    invoke-interface {v0, v1}, Lo/afg;->c(Lo/acl;)V

    .line 140
    iget-object v0, p0, Lo/afb$e;->o:Lo/alk$e;

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/alk$e;->b(Ljava/lang/String;)V

    .line 141
    goto/16 :goto_3

    .line 143
    :cond_5
    iget-object v0, p0, Lo/afb$e;->k:Landroid/os/Bundle;

    const/16 v1, 0x1e

    invoke-direct {p0, v1, v0}, Lo/afb$e;->c(ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 145
    iget-object v0, p0, Lo/afb$e;->c:Lo/afb;

    invoke-static {v0}, Lo/afb;->b(Lo/afb;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 146
    iget-object v0, p0, Lo/afb$e;->c:Lo/afb;

    invoke-static {v0}, Lo/afb;->b(Lo/afb;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    :cond_6
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter startMeasureSelectedDevice true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 150
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    const-string v6, ""

    .line 152
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 153
    const-string v0, "macAddress"

    iget-object v1, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    iget-object v0, p0, Lo/afb$e;->e:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 156
    :cond_7
    const-string v0, "macAddress"

    iget-object v1, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v1}, Lo/acp;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    iget-object v0, p0, Lo/afb$e;->d:Lo/acp;

    invoke-virtual {v0}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v6

    .line 159
    :goto_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v6, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 161
    const-string v0, "device_name"

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "device_type"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    sget-object v0, Lo/dae;->fT:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 164
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 166
    iget-object v0, p0, Lo/afb$e;->c:Lo/afb;

    invoke-static {v0}, Lo/afb;->b(Lo/afb;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    iget-object v0, p0, Lo/afb$e;->o:Lo/alk$e;

    iget-object v1, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/alk$e;->b(Ljava/lang/String;)V

    .line 170
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter target productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afb$e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    goto :goto_3

    .line 113
    :cond_8
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    .line 176
    :cond_9
    :goto_3
    return-void
.end method
