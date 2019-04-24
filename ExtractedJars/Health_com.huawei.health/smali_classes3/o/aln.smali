.class public Lo/aln;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private a:Lo/ve;

.field private b:Landroid/content/Context;

.field private d:Lo/amn;

.field private e:Landroid/os/PowerManager$WakeLock;

.field private f:Z

.field private g:I

.field private h:Landroid/os/Handler;

.field private i:Landroid/os/PowerManager;

.field private k:I

.field private l:Z

.field private n:Ljava/lang/Runnable;

.field private final o:Landroid/hardware/SensorEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-string v0, "Track_ActivityRecognitionProxy"

    sput-object v0, Lo/aln;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aln;->d:Lo/amn;

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aln;->f:Z

    .line 63
    const/16 v0, 0x28

    iput v0, p0, Lo/aln;->k:I

    .line 64
    const/16 v0, 0x258

    iput v0, p0, Lo/aln;->g:I

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aln;->n:Ljava/lang/Runnable;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aln;->l:Z

    .line 442
    new-instance v0, Lo/aln$4;

    invoke-direct {v0, p0}, Lo/aln$4;-><init>(Lo/aln;)V

    iput-object v0, p0, Lo/aln;->o:Landroid/hardware/SensorEventListener;

    .line 73
    iput-object p1, p0, Lo/aln;->b:Landroid/content/Context;

    .line 74
    new-instance v0, Lo/amn;

    invoke-direct {v0, p1}, Lo/amn;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/aln;->d:Lo/amn;

    .line 75
    new-instance v0, Lo/ve;

    iget-object v1, p0, Lo/aln;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ve;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/aln;->a:Lo/ve;

    .line 76
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lo/aln;->i:Landroid/os/PowerManager;

    .line 77
    iget-object v0, p0, Lo/aln;->i:Landroid/os/PowerManager;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lo/aln;->i:Landroid/os/PowerManager;

    const-string v1, "Health_AutoTrack"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lo/aln;->e:Landroid/os/PowerManager$WakeLock;

    .line 81
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/aln;)Lo/ve;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/aln;->a:Lo/ve;

    return-object v0
.end method

.method private a(Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V
    .locals 4

    .line 203
    const-string v0, "android.activity_recognition.running"

    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 206
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityChanged enter running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    if-eqz v0, :cond_3

    .line 208
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    sget-object v1, Lo/amn$e;->a:Lo/amn$e;

    invoke-virtual {v0, v1}, Lo/amn;->b(Lo/amn$e;)V

    goto/16 :goto_0

    .line 211
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 212
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityChanged exit running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-direct {p0}, Lo/aln;->m()V

    .line 215
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    if-eqz v0, :cond_3

    .line 216
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    sget-object v1, Lo/amn$e;->b:Lo/amn$e;

    invoke-virtual {v0, v1}, Lo/amn;->b(Lo/amn$e;)V

    .line 217
    iget-boolean v0, p0, Lo/aln;->l:Z

    if-eqz v0, :cond_3

    .line 218
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    const-string v1, "com.huawei.health.track.exit_running"

    invoke-direct {p0, v0, v1}, Lo/aln;->e(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 222
    :cond_1
    const-string v0, "android.activity_recognition.on_bicycle"

    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getActivity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 223
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 224
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityChanged enter bicycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    if-eqz v0, :cond_3

    .line 226
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    sget-object v1, Lo/amn$e;->d:Lo/amn$e;

    invoke-virtual {v0, v1}, Lo/amn;->b(Lo/amn$e;)V

    goto :goto_0

    .line 229
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 230
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityChanged exit bicycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    if-eqz v0, :cond_3

    .line 232
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    sget-object v1, Lo/amn$e;->e:Lo/amn$e;

    invoke-virtual {v0, v1}, Lo/amn;->b(Lo/amn$e;)V

    .line 236
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/aln;)Landroid/os/Handler;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 190
    iget-boolean v0, p0, Lo/aln;->l:Z

    if-eqz v0, :cond_0

    .line 191
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aln;->l:Z

    .line 192
    invoke-direct {p0}, Lo/aln;->i()V

    .line 193
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    const-string v1, "com.huawei.health.AUTO_TRACK_END"

    invoke-direct {p0, v0, v1}, Lo/aln;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 196
    :cond_0
    iget-object v0, p0, Lo/aln;->a:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->b()Z

    .line 197
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disconnectWithARModule finished "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void
.end method

.method static synthetic b(Lo/aln;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lo/aln;->e(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lo/aln;Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/aln;->a(Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V

    return-void
.end method

.method private c()V
    .locals 5

    .line 128
    :try_start_0
    iget-object v0, p0, Lo/aln;->a:Lo/ve;

    new-instance v1, Lo/aln$5;

    invoke-direct {v1, p0}, Lo/aln$5;-><init>(Lo/aln;)V

    new-instance v2, Lo/aln$1;

    invoke-direct {v2, p0}, Lo/aln$1;-><init>(Lo/aln;)V

    invoke-virtual {v0, v1, v2}, Lo/ve;->e(Lo/vg;Lo/vm;)Z

    .line 181
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectWithARModule finished "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 186
    goto :goto_0

    .line 182
    :catch_0
    move-exception v4

    .line 183
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectARModule SecurityException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    goto :goto_0

    .line 184
    :catch_1
    move-exception v4

    .line 185
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectARModule failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .line 259
    const-string v0, "com.huawei.health.track.running"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aln;->l:Z

    .line 261
    const-string v1, "android.activity_recognition.running"

    .line 262
    invoke-direct {p0, v1}, Lo/aln;->d(Ljava/lang/String;)V

    .line 263
    goto :goto_0

    .line 264
    :cond_0
    const-string v0, "com.huawei.health.AUTO_TRACK_END"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aln;->l:Z

    .line 266
    invoke-direct {p0}, Lo/aln;->i()V

    .line 268
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/aln;)Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lo/aln;->f:Z

    return v0
.end method

.method static synthetic d(Lo/aln;)Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 7

    .line 99
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->l(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 101
    if-eqz v4, :cond_2

    .line 103
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/aln;->f:Z

    .line 105
    iget-boolean v0, p0, Lo/aln;->f:Z

    if-nez v0, :cond_0

    .line 106
    return-void

    .line 110
    :cond_0
    const/4 v0, 0x1

    :try_start_0
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 111
    const/4 v0, 0x2

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 113
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    invoke-virtual {v0, v5, v6}, Lo/amn;->e(II)V

    .line 117
    :cond_1
    iput v5, p0, Lo/aln;->k:I

    .line 118
    iput v6, p0, Lo/aln;->g:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    goto :goto_0

    .line 120
    :catch_0
    move-exception v5

    .line 121
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initConfig NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :cond_2
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .line 272
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAutoTrackHeartBeat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    .line 274
    new-instance v0, Lo/aln$3;

    invoke-direct {v0, p0, p1}, Lo/aln$3;-><init>(Lo/aln;Ljava/lang/String;)V

    iput-object v0, p0, Lo/aln;->n:Ljava/lang/Runnable;

    .line 288
    iget-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    iget-object v1, p0, Lo/aln;->n:Ljava/lang/Runnable;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 289
    return-void
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/aln;)Lo/amn;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    return-object v0
.end method

.method private e(J)V
    .locals 4

    .line 396
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WakeLock acquire"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lo/aln;->e:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, p1, p2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 398
    return-void
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 245
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 246
    const-string v5, "com.huawei.health.track.broadcast"

    .line 247
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBrocast() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " action == "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v5, v1, v2

    const-string v2, " ,msg == "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 249
    invoke-virtual {v6, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 250
    invoke-virtual {v6, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 251
    const-string v0, "track_msg"

    invoke-virtual {v6, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 252
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p1, v6, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 253
    invoke-direct {p0, p2}, Lo/aln;->c(Ljava/lang/String;)V

    .line 254
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 7

    .line 358
    const-string v0, "autotrack_enable"

    iget-boolean v1, p0, Lo/aln;->f:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 359
    const-string v0, "start_delay"

    iget v1, p0, Lo/aln;->k:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 360
    const-string v0, "stop_delay"

    iget v1, p0, Lo/aln;->g:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 364
    if-eqz v4, :cond_0

    iget-boolean v0, p0, Lo/aln;->f:Z

    if-nez v0, :cond_0

    .line 365
    invoke-direct {p0}, Lo/aln;->c()V

    goto :goto_0

    .line 366
    :cond_0
    if-nez v4, :cond_1

    iget-boolean v0, p0, Lo/aln;->f:Z

    if-eqz v0, :cond_1

    .line 367
    invoke-direct {p0}, Lo/aln;->b()V

    .line 370
    :cond_1
    :goto_0
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "change startDelay "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " stopDelay "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " state "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 371
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 370
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    if-eqz v0, :cond_2

    .line 374
    iget-object v0, p0, Lo/aln;->d:Lo/amn;

    invoke-virtual {v0, v5, v6}, Lo/amn;->e(II)V

    .line 377
    :cond_2
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    invoke-static {v0, v4, v5, v6}, Lo/amy;->a(Landroid/content/Context;ZII)V

    .line 380
    iget-boolean v0, p0, Lo/aln;->f:Z

    if-eq v4, v0, :cond_3

    .line 381
    iput-boolean v4, p0, Lo/aln;->f:Z

    .line 384
    :cond_3
    return-void
.end method

.method private f()V
    .locals 4

    .line 345
    invoke-direct {p0}, Lo/aln;->k()V

    .line 346
    invoke-direct {p0}, Lo/aln;->m()V

    .line 347
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 348
    new-instance v0, Lo/aln$2;

    invoke-direct {v0, p0}, Lo/aln$2;-><init>(Lo/aln;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 354
    return-void
.end method

.method private g()Z
    .locals 5

    .line 406
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 407
    const/4 v0, 0x0

    return v0

    .line 409
    :cond_0
    const/4 v2, 0x0

    .line 410
    const/4 v3, 0x0

    .line 411
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/location/LocationManager;

    .line 413
    if-eqz v4, :cond_1

    .line 414
    const-string v0, "gps"

    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v2

    .line 415
    const-string v0, "GpsMockProvider"

    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    .line 418
    :cond_1
    if-eqz v4, :cond_3

    if-nez v2, :cond_2

    if-eqz v3, :cond_3

    .line 419
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 421
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private h()V
    .locals 4

    .line 327
    iget-boolean v0, p0, Lo/aln;->f:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo/aln;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "## processAlarmEvent "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const-string v0, "android.activity_recognition.running"

    invoke-virtual {p0, v0}, Lo/aln;->a(Ljava/lang/String;)Z

    .line 335
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    const-string v1, "com.huawei.health.track.running"

    invoke-direct {p0, v0, v1}, Lo/aln;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 336
    const-wide/16 v0, 0x2710

    invoke-direct {p0, v0, v1}, Lo/aln;->e(J)V

    .line 342
    :cond_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 293
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopAutoTrackHeartBeat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aln;->n:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    iget-object v1, p0, Lo/aln;->n:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 297
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aln;->n:Ljava/lang/Runnable;

    .line 298
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aln;->h:Landroid/os/Handler;

    .line 299
    return-void
.end method

.method private k()V
    .locals 4

    .line 387
    iget-object v0, p0, Lo/aln;->e:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    .line 388
    iget-object v0, p0, Lo/aln;->e:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WakeLock release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    iget-object v0, p0, Lo/aln;->e:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 393
    :cond_0
    return-void
.end method

.method private m()V
    .locals 6

    .line 428
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/hardware/SensorManager;

    .line 429
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushStepCounterData manager is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    if-eqz v4, :cond_0

    .line 432
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 433
    iget-object v0, p0, Lo/aln;->o:Landroid/hardware/SensorEventListener;

    const/16 v1, 0x13

    invoke-virtual {v4, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v5

    .line 434
    iget-object v0, p0, Lo/aln;->o:Landroid/hardware/SensorEventListener;

    const/16 v1, 0x13

    invoke-virtual {v4, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 435
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " flushStepCounterData registerListener = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    :cond_0
    iget-object v0, p0, Lo/aln;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/alt;->b(Lo/ala;)V

    .line 440
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 88
    invoke-direct {p0}, Lo/aln;->d()V

    .line 90
    iget-boolean v0, p0, Lo/aln;->f:Z

    if-eqz v0, :cond_0

    .line 91
    invoke-direct {p0}, Lo/aln;->c()V

    .line 94
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 7

    .line 450
    iget-object v0, p0, Lo/aln;->a:Lo/ve;

    if-eqz v0, :cond_3

    .line 451
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    .line 452
    iget-object v0, p0, Lo/aln;->a:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 453
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/4 v0, 0x1

    return v0

    .line 456
    :cond_0
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aln;->a:Lo/ve;

    invoke-virtual {v3}, Lo/ve;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 458
    :cond_1
    iget-object v0, p0, Lo/aln;->a:Lo/ve;

    invoke-virtual {v0}, Lo/ve;->e()Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v4

    .line 459
    if-eqz v4, :cond_3

    .line 460
    invoke-virtual {v4}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;->getActivityRecognitionExtendEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 461
    invoke-virtual {v6}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 462
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    const/4 v0, 0x1

    return v0

    .line 465
    :cond_2
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->getActivity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    goto :goto_0

    .line 470
    :cond_3
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/content/Intent;)Z
    .locals 6

    .line 304
    if-nez p1, :cond_0

    .line 305
    const/4 v0, 0x0

    return v0

    .line 308
    :cond_0
    const/4 v4, 0x1

    .line 309
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 310
    if-eqz v5, :cond_4

    .line 311
    sget-object v0, Lo/aln;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processAlarmEvent "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    const-string v0, "SEND_START_BROCAST"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    invoke-direct {p0}, Lo/aln;->h()V

    goto :goto_0

    .line 314
    :cond_1
    const-string v0, "SEND_STOP_BROCAST"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    invoke-direct {p0}, Lo/aln;->f()V

    goto :goto_0

    .line 316
    :cond_2
    const-string v0, "com.huawei.health.track.config"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 317
    invoke-direct {p0, p1}, Lo/aln;->e(Landroid/content/Intent;)V

    goto :goto_0

    .line 319
    :cond_3
    const/4 v4, 0x0

    .line 323
    :cond_4
    :goto_0
    return v4
.end method
