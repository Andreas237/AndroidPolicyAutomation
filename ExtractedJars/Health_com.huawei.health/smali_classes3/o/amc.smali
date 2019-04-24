.class public Lo/amc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aky;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amc$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Lo/alt;

.field private d:Landroid/os/PowerManager;

.field private e:Landroid/content/Context;

.field private f:Landroid/os/HandlerThread;

.field private g:Lo/abb;

.field private h:Lo/amc$a;

.field private i:Landroid/hardware/SensorManager;

.field private k:I

.field private l:I

.field private final o:Landroid/hardware/SensorEventListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->e:Landroid/content/Context;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->c:Lo/alt;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->d:Landroid/os/PowerManager;

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/amc;->b:I

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/amc;->a:I

    .line 58
    const/16 v0, 0x3e8

    iput v0, p0, Lo/amc;->k:I

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->g:Lo/abb;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->h:Lo/amc$a;

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/amc;->l:I

    .line 328
    new-instance v0, Lo/amc$4;

    invoke-direct {v0, p0}, Lo/amc$4;-><init>(Lo/amc;)V

    iput-object v0, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    .line 72
    iput-object p1, p0, Lo/amc;->e:Landroid/content/Context;

    .line 73
    iget-object v0, p0, Lo/amc;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lo/amc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    iput-object v0, p0, Lo/amc;->c:Lo/alt;

    .line 75
    iget-object v0, p0, Lo/amc;->e:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    .line 76
    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lo/amc;->d:Landroid/os/PowerManager;

    .line 78
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/amc;)Landroid/content/Context;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/amc;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/amc;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/amc;->l:I

    return v0
.end method

.method static synthetic b(Lo/amc;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/amc;->a:I

    return p1
.end method

.method static synthetic c(Lo/amc;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lo/amc;->e(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/amc;)Z
    .locals 1

    .line 27
    invoke-direct {p0}, Lo/amc;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/amc;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/amc;->k:I

    return v0
.end method

.method private d(Z)V
    .locals 5

    .line 139
    iget-object v0, p0, Lo/amc;->g:Lo/abb;

    if-eqz v0, :cond_1

    .line 142
    if-eqz p1, :cond_0

    .line 143
    :try_start_0
    iget-object v0, p0, Lo/amc;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->n()I

    move-result v0

    iput v0, p0, Lo/amc;->b:I

    .line 145
    :cond_0
    iget-object v0, p0, Lo/amc;->g:Lo/abb;

    iget v1, p0, Lo/amc;->b:I

    iget v2, p0, Lo/amc;->a:I

    invoke-interface {v0, v1, v2}, Lo/abb;->d(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    goto :goto_0

    .line 146
    :catch_0
    move-exception v4

    .line 147
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/amc;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/amc;->b:I

    return p1
.end method

.method static synthetic e(Lo/amc;)Lo/amc$a;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    return-object v0
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 154
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 156
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBrocast() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " action == "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 159
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    const-string v0, "com.huawei.health.track.broadcast"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 161
    const-string v0, "track_msg"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p1, v5, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 163
    return-void
.end method

.method static synthetic e(Lo/amc;Z)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/amc;->d(Z)V

    return-void
.end method

.method private f()Z
    .locals 5

    .line 167
    const/4 v4, 0x0

    .line 169
    iget-object v0, p0, Lo/amc;->d:Landroid/os/PowerManager;

    if-eqz v0, :cond_0

    .line 171
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_0

    .line 172
    iget-object v0, p0, Lo/amc;->d:Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v4

    .line 176
    :cond_0
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isScreenOn "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return v4
.end method

.method static synthetic h(Lo/amc;)I
    .locals 2

    .line 27
    iget v0, p0, Lo/amc;->l:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/amc;->l:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 297
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 298
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 299
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v4

    .line 300
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "restartSensor registerListener = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 267
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Lo/amc$a;->removeMessages(I)V

    .line 269
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const/16 v1, 0x7d0

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Lo/amc$a;->sendEmptyMessageDelayed(IJ)Z

    .line 271
    :cond_0
    return-void
.end method

.method public b(Lo/abb;I)Z
    .locals 5

    .line 188
    if-eqz p1, :cond_0

    const/16 v0, 0x3e8

    if-ge p2, v0, :cond_1

    .line 189
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 192
    :cond_1
    iput-object p1, p0, Lo/amc;->g:Lo/abb;

    .line 193
    iput p2, p0, Lo/amc;->k:I

    .line 196
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "flush_worker_thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    .line 197
    iget-object v0, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 198
    new-instance v0, Lo/amc$a;

    iget-object v1, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/amc$a;-><init>(Lo/amc;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/amc;->h:Lo/amc$a;

    .line 201
    iget-object v0, p0, Lo/amc;->c:Lo/alt;

    if-eqz v0, :cond_2

    .line 202
    iget-object v0, p0, Lo/amc;->c:Lo/alt;

    invoke-virtual {v0, p0}, Lo/alt;->b(Lo/aky;)V

    .line 207
    :cond_2
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_3

    .line 208
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v4

    .line 209
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " startReportRealTimeStepData registerListener = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :cond_3
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_4

    .line 213
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const-string v1, "refresh"

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2, v1}, Lo/amc$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 215
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 4

    .line 252
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_0

    .line 253
    const/4 v0, 0x0

    iput v0, p0, Lo/amc;->l:I

    .line 254
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const/16 v1, 0x7d0

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Lo/amc$a;->sendEmptyMessageDelayed(IJ)Z

    .line 256
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 4

    .line 224
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->g:Lo/abb;

    .line 225
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lo/amc$a;->removeMessages(I)V

    .line 227
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/amc$a;->removeMessages(I)V

    .line 232
    :cond_0
    iget-object v0, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    .line 233
    iget-object v0, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 234
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amc;->f:Landroid/os/HandlerThread;

    .line 238
    :cond_1
    iget-object v0, p0, Lo/amc;->c:Lo/alt;

    if-eqz v0, :cond_2

    .line 239
    iget-object v0, p0, Lo/amc;->c:Lo/alt;

    invoke-virtual {v0, p0}, Lo/alt;->e(Lo/aky;)V

    .line 243
    :cond_2
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_3

    .line 244
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 246
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public e()V
    .locals 2

    .line 260
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Lo/amc$a;->removeMessages(I)V

    .line 263
    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 2

    .line 276
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    invoke-virtual {v0}, Lo/amc$a;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 278
    const/16 v0, 0x3ea

    iput v0, v1, Landroid/os/Message;->what:I

    .line 279
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 280
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    invoke-virtual {v0, v1}, Lo/amc$a;->sendMessage(Landroid/os/Message;)Z

    .line 282
    :cond_0
    return-void
.end method

.method public e(JIII)V
    .locals 2

    .line 287
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    invoke-virtual {v0}, Lo/amc$a;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 289
    const/16 v0, 0x3eb

    iput v0, v1, Landroid/os/Message;->what:I

    .line 290
    iput p5, v1, Landroid/os/Message;->arg1:I

    .line 291
    iget-object v0, p0, Lo/amc;->h:Lo/amc$a;

    invoke-virtual {v0, v1}, Lo/amc$a;->sendMessage(Landroid/os/Message;)Z

    .line 293
    :cond_0
    return-void
.end method

.method public k()V
    .locals 6

    .line 307
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    .line 310
    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    .line 309
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v4

    .line 312
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " forceRefrushStepCounter registerListener = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    iget-object v0, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lo/amc;->o:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lo/amc;->i:Landroid/hardware/SensorManager;

    .line 315
    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    .line 314
    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 317
    invoke-direct {p0}, Lo/amc;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 319
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    goto :goto_0

    .line 320
    :catch_0
    move-exception v5

    .line 321
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forceRefrushStepCounter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    :cond_0
    :goto_0
    return-void
.end method
