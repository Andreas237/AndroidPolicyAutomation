.class public Lo/cwj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:J

.field private static b:J

.field private static c:Z

.field private static d:Lo/dik;

.field private static e:Landroid/hardware/SensorManager;

.field private static g:Landroid/hardware/SensorEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/cwj;->b:J

    .line 24
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/cwj;->a:J

    .line 50
    new-instance v0, Lo/cwj$4;

    invoke-direct {v0}, Lo/cwj$4;-><init>()V

    sput-object v0, Lo/cwj;->g:Landroid/hardware/SensorEventListener;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Landroid/hardware/SensorEventListener;
    .locals 1

    .line 16
    sget-object v0, Lo/cwj;->g:Landroid/hardware/SensorEventListener;

    return-object v0
.end method

.method public static b()V
    .locals 2

    .line 80
    sget-boolean v0, Lo/cwj;->c:Z

    if-eqz v0, :cond_0

    .line 81
    sget-object v0, Lo/cwj;->e:Landroid/hardware/SensorManager;

    sget-object v1, Lo/cwj;->g:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 83
    :cond_0
    return-void
.end method

.method static synthetic c()J
    .locals 2

    .line 16
    sget-wide v0, Lo/cwj;->a:J

    return-wide v0
.end method

.method static synthetic d(J)J
    .locals 0

    .line 16
    sput-wide p0, Lo/cwj;->a:J

    return-wide p0
.end method

.method static synthetic d()Landroid/hardware/SensorManager;
    .locals 1

    .line 16
    sget-object v0, Lo/cwj;->e:Landroid/hardware/SensorManager;

    return-object v0
.end method

.method static synthetic e()J
    .locals 2

    .line 16
    sget-wide v0, Lo/cwj;->b:J

    return-wide v0
.end method

.method public static e(Landroid/content/Context;Lo/dik;)V
    .locals 6

    .line 28
    const-string v0, "FitnessSensorInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSensorInfo :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    sput-object p1, Lo/cwj;->d:Lo/dik;

    .line 30
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 31
    const-string v0, "FitnessSensorInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    return-void

    .line 34
    :cond_0
    sget-object v0, Lo/cwj;->e:Landroid/hardware/SensorManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    sput-object v0, Lo/cwj;->e:Landroid/hardware/SensorManager;

    .line 37
    :cond_1
    sget-object v0, Lo/cwj;->e:Landroid/hardware/SensorManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v5

    .line 38
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 39
    const-string v0, "FitnessSensorInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sensorAcc is not fetched"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    return-void

    .line 42
    :cond_2
    sget-object v0, Lo/cwj;->e:Landroid/hardware/SensorManager;

    sget-object v1, Lo/cwj;->g:Landroid/hardware/SensorEventListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v0

    sput-boolean v0, Lo/cwj;->c:Z

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lo/cwj;->b:J

    .line 44
    const-string v0, "FitnessSensorInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registersuccess :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/cwj;->c:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "openSensorTimeTemp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-wide v3, Lo/cwj;->b:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.method static synthetic i()Lo/dik;
    .locals 1

    .line 16
    sget-object v0, Lo/cwj;->d:Lo/dik;

    return-object v0
.end method
