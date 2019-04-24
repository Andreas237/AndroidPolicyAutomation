.class public Lcom/huawei/health/manager/PreDaemonService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/manager/PreDaemonService$a;
    }
.end annotation


# instance fields
.field private a:Landroid/hardware/SensorManager;

.field private b:Z

.field private c:Lcom/huawei/health/manager/PreDaemonService$a;

.field private d:Landroid/content/Context;

.field private e:I

.field private h:Lo/akm;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    .line 25
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/manager/PreDaemonService;->e:I

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/manager/PreDaemonService;->b:Z

    .line 61
    new-instance v0, Lcom/huawei/health/manager/PreDaemonService$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/manager/PreDaemonService$a;-><init>(Lcom/huawei/health/manager/PreDaemonService;Lcom/huawei/health/manager/PreDaemonService$4;)V

    iput-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->c:Lcom/huawei/health/manager/PreDaemonService$a;

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->h:Lo/akm;

    .line 31
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/manager/PreDaemonService;)Lo/akm;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->h:Lo/akm;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/manager/PreDaemonService;Lo/akm;)Lo/akm;
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/manager/PreDaemonService;->h:Lo/akm;

    return-object p1
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 59
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not yet implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCreate()V
    .locals 6

    .line 65
    const-string v0, "Step_PreD"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 67
    invoke-virtual {p0}, Lcom/huawei/health/manager/PreDaemonService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->d:Landroid/content/Context;

    .line 68
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    return-void

    .line 71
    :cond_0
    invoke-static {p0}, Lo/amy;->t(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_1

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->b(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {p0, v0}, Lo/amy;->c(Landroid/content/Context;I)V

    .line 74
    :cond_1
    const-string v0, "sensor"

    invoke-virtual {p0, v0}, Lcom/huawei/health/manager/PreDaemonService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    .line 75
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_2

    .line 76
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    const/16 v2, 0x13

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v4

    .line 78
    const-string v0, "Step_PreD"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " registerListener "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :cond_2
    invoke-static {p0}, Lo/akz;->h(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v4

    .line 82
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->c:Lcom/huawei/health/manager/PreDaemonService$a;

    const/4 v1, 0x1

    invoke-virtual {p0, v4, v0, v1}, Lcom/huawei/health/manager/PreDaemonService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/manager/PreDaemonService;->b:Z

    goto :goto_0

    .line 86
    :cond_3
    const-string v0, "Step_PreD"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :goto_0
    goto :goto_1

    .line 88
    :catch_0
    move-exception v5

    .line 89
    const-string v0, "Step_PreD"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 95
    const-string v0, "Step_PreD"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 97
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 103
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/manager/PreDaemonService;->b:Z

    if-eqz v0, :cond_2

    .line 104
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->c:Lcom/huawei/health/manager/PreDaemonService$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/manager/PreDaemonService;->unbindService(Landroid/content/ServiceConnection;)V

    .line 106
    :cond_2
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 7

    .line 35
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    .line 36
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    float-to-int v4, v0

    .line 37
    const-string v0, "Step_PreD"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSensorChanged: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    iget v0, p0, Lcom/huawei/health/manager/PreDaemonService;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 39
    iput v4, p0, Lcom/huawei/health/manager/PreDaemonService;->e:I

    .line 41
    :cond_0
    iget v0, p0, Lcom/huawei/health/manager/PreDaemonService;->e:I

    sub-int v0, v4, v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    .line 42
    invoke-virtual {p0}, Lcom/huawei/health/manager/PreDaemonService;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/amy;->e(Landroid/content/Context;Z)V

    .line 43
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 44
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/manager/PreDaemonService;->e:I

    sub-int v1, v4, v1

    invoke-virtual {v0, v1}, Lo/alt;->d(I)V

    .line 47
    :try_start_0
    invoke-virtual {p0, v5}, Lcom/huawei/health/manager/PreDaemonService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_0

    .line 48
    :catch_0
    move-exception v6

    .line 49
    const-string v0, "Step_PreD"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PreDaemonService onSensorChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/manager/PreDaemonService;->stopSelf()V

    .line 55
    :cond_1
    return-void
.end method
