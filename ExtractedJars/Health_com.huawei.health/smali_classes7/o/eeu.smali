.class public Lo/eeu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# static fields
.field private static e:Ljava/lang/String;

.field private static volatile r:Lo/eeu;


# instance fields
.field private a:Lo/eey;

.field private b:Lcom/huawei/treadmill/JniTest;

.field private c:Z

.field private d:Landroid/hardware/SensorManager;

.field private f:Landroid/content/Context;

.field private g:Z

.field private h:Landroid/os/Handler;

.field private i:Ljava/lang/Runnable;

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private s:I

.field private t:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const-string v0, "Track_stepCounter"

    sput-object v0, Lo/eeu;->e:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eeu;->c:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eeu;->k:Z

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eeu;->g:Z

    .line 31
    const/16 v0, 0x3e8

    iput v0, p0, Lo/eeu;->p:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/eeu;->n:I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/eeu;->o:I

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lo/eeu;->m:I

    .line 35
    const/16 v0, 0x12c

    iput v0, p0, Lo/eeu;->l:I

    .line 36
    const/16 v0, 0x3e8

    iput v0, p0, Lo/eeu;->t:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/eeu;->s:I

    .line 41
    iput-object p1, p0, Lo/eeu;->f:Landroid/content/Context;

    .line 42
    iput-boolean p2, p0, Lo/eeu;->g:Z

    .line 43
    return-void
.end method

.method static synthetic a(Lo/eeu;)Lcom/huawei/treadmill/JniTest;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    return-object v0
.end method

.method static synthetic b(Lo/eeu;)I
    .locals 1

    .line 19
    iget v0, p0, Lo/eeu;->o:I

    return v0
.end method

.method static synthetic b()Lo/eeu;
    .locals 1

    .line 19
    sget-object v0, Lo/eeu;->r:Lo/eeu;

    return-object v0
.end method

.method public static declared-synchronized c(Landroid/content/Context;Z)Lo/eeu;
    .locals 3

    const-class v2, Lo/eeu;

    monitor-enter v2

    .line 50
    if-nez p0, :cond_0

    .line 51
    :try_start_0
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "getInstance of StepsCounter, context is null, return null"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_0
    sget-object v0, Lo/eeu;->r:Lo/eeu;

    if-nez v0, :cond_1

    .line 55
    new-instance v0, Lo/eeu;

    invoke-direct {v0, p0, p1}, Lo/eeu;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lo/eeu;->r:Lo/eeu;

    .line 56
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "getInstance of StepsCounter, instance == null, create a new one"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 58
    :cond_1
    sget-object v0, Lo/eeu;->r:Lo/eeu;

    iput-object p0, v0, Lo/eeu;->f:Landroid/content/Context;

    .line 59
    sget-object v0, Lo/eeu;->r:Lo/eeu;

    iput-boolean p1, v0, Lo/eeu;->g:Z

    .line 60
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "getInstance of StepsCounter, instance is not null, no need to create a new one, just refresh context and stop last counter"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    sget-object v0, Lo/eeu;->r:Lo/eeu;

    invoke-virtual {v0}, Lo/eeu;->a()V

    .line 63
    :goto_0
    sget-object v0, Lo/eeu;->r:Lo/eeu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method static synthetic c(Lo/eeu;)Lo/eey;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/eeu;->a:Lo/eey;

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 291
    const/4 v0, 0x0

    iput v0, p0, Lo/eeu;->n:I

    .line 292
    const/4 v0, 0x0

    iput v0, p0, Lo/eeu;->o:I

    .line 293
    const/4 v0, -0x1

    iput v0, p0, Lo/eeu;->m:I

    .line 294
    const/16 v0, 0x64

    iput v0, p0, Lo/eeu;->l:I

    .line 295
    const/16 v0, 0x3e8

    iput v0, p0, Lo/eeu;->t:I

    .line 296
    const/4 v0, 0x0

    iput v0, p0, Lo/eeu;->s:I

    .line 297
    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 19
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/eeu;)Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lo/eeu;->k:Z

    return v0
.end method

.method static synthetic e(Lo/eeu;)I
    .locals 1

    .line 19
    iget v0, p0, Lo/eeu;->m:I

    return v0
.end method

.method static synthetic e(Lo/eeu;I)I
    .locals 0

    .line 19
    iput p1, p0, Lo/eeu;->m:I

    return p1
.end method

.method static synthetic f(Lo/eeu;)Landroid/os/Handler;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lo/eeu;)I
    .locals 1

    .line 19
    iget v0, p0, Lo/eeu;->p:I

    return v0
.end method

.method static synthetic i(Lo/eeu;)Ljava/lang/Runnable;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 223
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "just into stopCountSteps."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eeu;->k:Z

    .line 225
    iget-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 228
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lo/eeu;->f:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 229
    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "stopCountSteps. no read/write permissions"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 232
    :cond_1
    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/eeu;->f:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 233
    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    invoke-virtual {v0}, Lcom/huawei/treadmill/JniTest;->stopAlg()V

    .line 235
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_4

    .line 236
    iget-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    sget-object v1, Lo/eeu;->r:Lo/eeu;

    iget-object v2, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 237
    iget-boolean v0, p0, Lo/eeu;->g:Z

    if-eqz v0, :cond_3

    .line 238
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "flag is true and use steps outside, do not need to unregister TYPE_STEP_COUNTER"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 241
    :cond_3
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "flag is false and not use steps outside, now unregister TYPE_STEP_COUNTER"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    iget-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    sget-object v1, Lo/eeu;->r:Lo/eeu;

    iget-object v2, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 246
    :cond_4
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 247
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 248
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->a:Lo/eey;

    .line 249
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 251
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eeu;->c:Z

    .line 252
    return-void
.end method

.method public a(I)V
    .locals 2

    .line 275
    iget-boolean v0, p0, Lo/eeu;->g:Z

    if-eqz v0, :cond_0

    .line 277
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "setCurStepsFromStepCountModule: ***"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    iput p1, p0, Lo/eeu;->n:I

    goto :goto_0

    .line 281
    :cond_0
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "setCurStepsFromStepCountModule: flag is false and not allowed to use steps outside"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    :goto_0
    return-void
.end method

.method public d(Lo/eex;Lo/eey;I)Z
    .locals 7

    .line 108
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "just into initAndStartCountSteps"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    iget-boolean v0, p0, Lo/eeu;->c:Z

    if-eqz v0, :cond_0

    .line 111
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "counter is running already, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    const/4 v0, 0x0

    return v0

    .line 114
    :cond_0
    iget-object v0, p0, Lo/eeu;->f:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 115
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "context is null, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->a:Lo/eey;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 121
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lo/eeu;->f:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 124
    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "no write/read permissions, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->a:Lo/eey;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 131
    const/4 v0, 0x0

    return v0

    .line 133
    :cond_2
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    const/16 v0, 0x64

    if-lt p3, v0, :cond_3

    const/16 v0, 0x2710

    if-le p3, v0, :cond_4

    .line 134
    :cond_3
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "input invalid, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 136
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->a:Lo/eey;

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 140
    const/4 v0, 0x0

    return v0

    .line 142
    :cond_4
    iget-object v0, p0, Lo/eeu;->f:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/hardware/SensorManager;

    .line 143
    if-nez v4, :cond_5

    .line 144
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "cannot get sensormanager, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 147
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->a:Lo/eey;

    .line 148
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 149
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 150
    const/4 v0, 0x0

    return v0

    .line 152
    :cond_5
    invoke-virtual {p1}, Lo/eex;->a()[I

    move-result-object v5

    .line 153
    iput-object p2, p0, Lo/eeu;->a:Lo/eey;

    .line 154
    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    if-nez v0, :cond_6

    .line 155
    new-instance v0, Lcom/huawei/treadmill/JniTest;

    invoke-direct {v0}, Lcom/huawei/treadmill/JniTest;-><init>()V

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 157
    :cond_6
    iget-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    if-nez v0, :cond_7

    .line 158
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 160
    :cond_7
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "will initAlg, length of personInfo is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    invoke-virtual {v0, v5}, Lcom/huawei/treadmill/JniTest;->initAlg([I)I

    move-result v6

    .line 166
    const/4 v0, 0x1

    if-ne v0, v6, :cond_8

    .line 167
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "init alg error, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 169
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    .line 170
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->a:Lo/eey;

    .line 171
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    .line 172
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 173
    const/4 v0, 0x0

    return v0

    .line 175
    :cond_8
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eeu;->c:Z

    .line 176
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eeu;->k:Z

    .line 177
    invoke-direct {p0}, Lo/eeu;->c()V

    .line 178
    iput p3, p0, Lo/eeu;->p:I

    .line 179
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v4, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 180
    iget-boolean v0, p0, Lo/eeu;->g:Z

    if-eqz v0, :cond_9

    .line 181
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "flag is true and will use steps outside, do not need to register TYPE_STEP_COUNTER"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 184
    :cond_9
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "flag is false and will not use steps outside, need to register TYPE_STEP_COUNTER"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    const/16 v0, 0x13

    invoke-virtual {v4, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    const v1, 0x7a120

    invoke-virtual {v4, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 188
    :goto_0
    iput-object v4, p0, Lo/eeu;->d:Landroid/hardware/SensorManager;

    .line 189
    new-instance v0, Lo/eeu$1;

    invoke-direct {v0, p0}, Lo/eeu$1;-><init>(Lo/eeu;)V

    iput-object v0, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    .line 216
    iget-object v0, p0, Lo/eeu;->h:Landroid/os/Handler;

    iget-object v1, p0, Lo/eeu;->i:Ljava/lang/Runnable;

    sget-object v2, Lo/eeu;->r:Lo/eeu;

    iget v2, v2, Lo/eeu;->p:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 217
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "start stepcounter success, return true"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    const/4 v0, 0x1

    return v0
.end method

.method public e()I
    .locals 2

    .line 270
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "getCurrentsteps: ***"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    iget v0, p0, Lo/eeu;->o:I

    return v0
.end method

.method public e(III)Z
    .locals 3

    .line 256
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "just into refreshWorkoutParameters"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    add-int/lit8 v0, p1, 0x32

    div-int/lit8 v2, v0, 0x64

    .line 258
    if-ltz v2, :cond_0

    const/16 v0, 0x12c

    if-gt v2, v0, :cond_0

    const/4 v0, -0x1

    if-lt p2, v0, :cond_0

    const v0, 0x98967f

    if-gt p2, v0, :cond_0

    if-ltz p3, :cond_0

    const/4 v0, 0x2

    if-le p3, v0, :cond_1

    .line 259
    :cond_0
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, "input invalid, return false"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    const/4 v0, 0x0

    return v0

    .line 262
    :cond_1
    iput v2, p0, Lo/eeu;->l:I

    .line 263
    iput p2, p0, Lo/eeu;->t:I

    .line 264
    iput p3, p0, Lo/eeu;->s:I

    .line 265
    const/4 v0, 0x1

    return v0
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 105
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 9

    .line 70
    iget-boolean v0, p0, Lo/eeu;->k:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    if-eqz v0, :cond_4

    .line 71
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 72
    iget-object v4, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 73
    const/4 v0, 0x3

    new-array v5, v0, [I

    const/4 v0, 0x0

    aget v0, v4, v0

    const/high16 v1, 0x45000000    # 2048.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x402399999999999aL    # 9.8

    div-double/2addr v0, v2

    double-to-int v0, v0

    const/4 v1, 0x0

    aput v0, v5, v1

    const/4 v0, 0x1

    aget v0, v4, v0

    const/high16 v1, 0x45000000    # 2048.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x402399999999999aL    # 9.8

    div-double/2addr v0, v2

    double-to-int v0, v0

    const/4 v1, 0x1

    aput v0, v5, v1

    const/4 v0, 0x2

    aget v0, v4, v0

    const/high16 v1, 0x45000000    # 2048.0f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide v2, 0x402399999999999aL    # 9.8

    div-double/2addr v0, v2

    double-to-int v0, v0

    const/4 v1, 0x2

    aput v0, v5, v1

    .line 76
    const/4 v0, 0x4

    new-array v6, v0, [I

    iget v0, p0, Lo/eeu;->t:I

    const/4 v1, 0x0

    aput v0, v6, v1

    iget v0, p0, Lo/eeu;->l:I

    const/4 v1, 0x1

    aput v0, v6, v1

    iget v0, p0, Lo/eeu;->n:I

    const/4 v1, 0x2

    aput v0, v6, v1

    iget v0, p0, Lo/eeu;->s:I

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 77
    iget-object v0, p0, Lo/eeu;->b:Lcom/huawei/treadmill/JniTest;

    invoke-virtual {v0, v5, v6}, Lcom/huawei/treadmill/JniTest;->processAlg([I[I)[I

    move-result-object v7

    .line 79
    array-length v0, v7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    aget v0, v7, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 80
    :cond_0
    iget-object v0, p0, Lo/eeu;->a:Lo/eey;

    if-eqz v0, :cond_1

    .line 81
    iget-object v0, p0, Lo/eeu;->a:Lo/eey;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lo/eey;->e(II)V

    .line 83
    :cond_1
    invoke-virtual {p0}, Lo/eeu;->a()V

    goto :goto_0

    .line 87
    :cond_2
    const/4 v0, 0x1

    aget v8, v7, v0

    .line 89
    iget v0, p0, Lo/eeu;->o:I

    add-int/2addr v0, v8

    iput v0, p0, Lo/eeu;->o:I

    .line 92
    :goto_0
    goto :goto_1

    :cond_3
    iget-boolean v0, p0, Lo/eeu;->g:Z

    if-nez v0, :cond_4

    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/16 v1, 0x13

    if-ne v0, v1, :cond_4

    .line 94
    sget-object v0, Lo/eeu;->e:Ljava/lang/String;

    const-string v1, " get a sensorStep value from TYPE_STEP_COUNTER"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iget v1, p0, Lo/eeu;->n:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 96
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lo/eeu;->n:I

    .line 100
    :cond_4
    :goto_1
    return-void
.end method
