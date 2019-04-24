.class public Lo/dkn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dkn$c;,
        Lo/dkn$a;
    }
.end annotation


# static fields
.field private static a:Lo/dkn;

.field private static b:I

.field private static c:Landroid/content/Context;

.field private static r:I

.field private static s:Ljava/util/concurrent/ExecutorService;

.field private static final v:Ljava/lang/Object;


# instance fields
.field private d:Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

.field private e:Lo/dea;

.field private f:I

.field private g:Z

.field private h:I

.field private i:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:Landroid/os/HandlerThread;

.field private t:Landroid/os/Handler;

.field private u:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 102
    const/4 v0, 0x0

    sput v0, Lo/dkn;->b:I

    .line 103
    const/4 v0, 0x0

    sput-object v0, Lo/dkn;->c:Landroid/content/Context;

    .line 104
    const/4 v0, 0x0

    sput-object v0, Lo/dkn;->a:Lo/dkn;

    .line 147
    const/16 v0, 0x7f

    sput v0, Lo/dkn;->r:I

    .line 156
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dkn;->s:Ljava/util/concurrent/ExecutorService;

    .line 613
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dkn;->v:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkn;->d:Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lo/dkn;->h:I

    .line 121
    const/16 v0, 0xf0

    iput v0, p0, Lo/dkn;->i:I

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkn;->g:Z

    .line 127
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkn;->k:Z

    .line 131
    const/16 v0, 0x1e

    iput v0, p0, Lo/dkn;->f:I

    .line 133
    const/16 v0, 0x1e

    iput v0, p0, Lo/dkn;->n:I

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkn;->l:Z

    .line 137
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkn;->m:Z

    .line 143
    const/4 v0, 0x2

    iput v0, p0, Lo/dkn;->p:I

    .line 145
    const/4 v0, 0x2

    iput v0, p0, Lo/dkn;->o:I

    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkn;->q:Landroid/os/HandlerThread;

    .line 195
    new-instance v0, Lo/dkn$2;

    invoke-direct {v0, p0}, Lo/dkn$2;-><init>(Lo/dkn;)V

    iput-object v0, p0, Lo/dkn;->u:Landroid/content/BroadcastReceiver;

    .line 161
    sget-object v0, Lo/dkn;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iput-object v0, p0, Lo/dkn;->e:Lo/dea;

    .line 165
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 166
    sget-object v0, Lo/dkn;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dkn;->u:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 168
    iget-object v0, p0, Lo/dkn;->q:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 169
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "NotifySendData"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dkn;->q:Landroid/os/HandlerThread;

    .line 170
    iget-object v0, p0, Lo/dkn;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 171
    new-instance v0, Lo/dkn$a;

    iget-object v1, p0, Lo/dkn;->q:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dkn$a;-><init>(Lo/dkn;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dkn;->t:Landroid/os/Handler;

    .line 172
    iget-object v0, p0, Lo/dkn;->t:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/32 v2, 0x36ee80

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 173
    iget-object v0, p0, Lo/dkn;->t:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 174
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start check notification service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :cond_0
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 4

    .line 415
    const/16 v0, 0x7f

    if-le p1, v0, :cond_0

    .line 416
    shr-int/lit8 v0, p1, 0x7

    add-int/lit16 v2, v0, 0x80

    .line 417
    and-int/lit8 v3, p1, 0x7f

    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 420
    :cond_0
    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lo/dba;)Lo/dkk;
    .locals 11

    .line 327
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unDeviceApply enter.. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    new-instance v5, Lo/dkk;

    invoke-direct {v5}, Lo/dkk;-><init>()V

    .line 329
    iget-object v6, p1, Lo/dba;->e:Ljava/util/List;

    .line 330
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 333
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 334
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v7

    .line 335
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v8

    .line 336
    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    .line 338
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dkk;->e(I)V

    .line 339
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "constraint.setContentLength:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v8, v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    .line 344
    :goto_1
    goto :goto_0

    .line 346
    :cond_0
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method private a([B)Lo/dkk;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 289
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetOtaParametersV2 enter... data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 291
    const-string v5, ""

    .line 293
    const/4 v6, -0x1

    .line 294
    const/4 v7, -0x1

    .line 296
    const/4 v8, 0x0

    :goto_0
    :try_start_0
    array-length v0, p1

    if-ge v8, v0, :cond_2

    .line 297
    aget-byte v0, p1, v8

    const/16 v1, 0x12

    if-ne v1, v0, :cond_1

    .line 298
    add-int/lit8 v0, v8, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    add-int/lit8 v0, v8, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 299
    move v6, v8

    .line 301
    :cond_0
    add-int/lit8 v0, v8, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    add-int/lit8 v0, v8, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 302
    move v7, v8

    .line 296
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 307
    :cond_2
    const/4 v0, -0x1

    if-eq v6, v0, :cond_3

    const/4 v0, -0x1

    if-eq v7, v0, :cond_3

    sub-int v0, v7, v6

    const/4 v1, 0x5

    if-le v0, v1, :cond_3

    .line 308
    sub-int v0, v7, v6

    add-int/lit8 v0, v0, -0x2

    new-array v8, v0, [B

    .line 309
    array-length v0, v8

    const/4 v1, 0x0

    invoke-static {p1, v6, v8, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 310
    invoke-static {v8}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 311
    goto :goto_1

    .line 313
    :cond_3
    const/16 v0, 0x9

    new-array v8, v0, [B

    .line 315
    array-length v0, v8

    const/4 v1, 0x0

    const/16 v0, 0x9

    invoke-static {p1, v6, v8, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 316
    invoke-static {v8}, Lo/czx;->e([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 320
    :goto_1
    goto :goto_2

    .line 318
    :catch_0
    move-exception v8

    .line 319
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unNotificationConstraint ,Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    :goto_2
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unGetOtaParametersV2 enter... tlvsString = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-virtual {v4, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 323
    invoke-direct {p0, v8}, Lo/dkn;->a(Lo/dba;)Lo/dkk;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/dkn;
    .locals 4

    .line 184
    sget-object v0, Lo/dkn;->a:Lo/dkn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 185
    sput-object p0, Lo/dkn;->c:Landroid/content/Context;

    .line 186
    const-string v0, "NotifySendData"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    new-instance v0, Lo/dkn;

    invoke-direct {v0}, Lo/dkn;-><init>()V

    sput-object v0, Lo/dkn;->a:Lo/dkn;

    .line 189
    :cond_0
    sget-object v0, Lo/dkn;->a:Lo/dkn;

    return-object v0
.end method

.method static synthetic b(Lo/dkn;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/dkn;->o()V

    return-void
.end method

.method static synthetic b(Lo/dkn;Z)Z
    .locals 0

    .line 55
    iput-boolean p1, p0, Lo/dkn;->k:Z

    return p1
.end method

.method static synthetic c(Lo/dkn;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/dkn;->h()V

    return-void
.end method

.method private c([BI)V
    .locals 14

    .line 739
    :try_start_0
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 740
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unNotificationContent enter... tlvsString = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    new-instance v5, Lo/daz;

    invoke-direct {v5}, Lo/daz;-><init>()V

    .line 742
    invoke-virtual {v5, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 743
    iget-object v7, v6, Lo/dba;->e:Ljava/util/List;

    .line 744
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 747
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 748
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 749
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v9

    .line 750
    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_3

    .line 752
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v9, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 754
    div-int/lit8 v0, v12, 0x6

    mul-int/lit8 v12, v0, 0x6

    .line 755
    if-lez v12, :cond_4

    .line 756
    move/from16 v0, p2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 757
    iput v12, p0, Lo/dkn;->f:I

    .line 758
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent mYellowPagesLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkn;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 759
    :cond_0
    move/from16 v0, p2

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 760
    iput v12, p0, Lo/dkn;->n:I

    .line 761
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unNotificationContent mContentSignLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkn;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 766
    :sswitch_1
    move/from16 v0, p2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 767
    const/16 v0, 0x10

    invoke-static {v9, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 768
    const/4 v0, 0x3

    if-ne v13, v0, :cond_1

    .line 769
    const/4 v0, 0x2

    iput v0, p0, Lo/dkn;->p:I

    goto :goto_1

    .line 771
    :cond_1
    iput v13, p0, Lo/dkn;->p:I

    .line 773
    :goto_1
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent mYellowPagesFomat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkn;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    goto :goto_3

    :cond_2
    move/from16 v0, p2

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 775
    const/16 v0, 0x10

    invoke-static {v9, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 776
    const/4 v0, 0x3

    if-ne v13, v0, :cond_3

    .line 777
    const/4 v0, 0x2

    iput v0, p0, Lo/dkn;->o:I

    goto :goto_2

    .line 779
    :cond_3
    iput v13, p0, Lo/dkn;->o:I

    .line 781
    :goto_2
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent mContentSignFomat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkn;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 782
    .line 787
    :cond_4
    :goto_3
    goto/16 :goto_0

    .line 791
    :cond_5
    goto :goto_4

    .line 789
    :catch_0
    move-exception v4

    .line 790
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent ,Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 792
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(Landroid/content/Context;)V
    .locals 5

    .line 917
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toggleNotificationListenerService enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 918
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 919
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 922
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 924
    return-void
.end method

.method static synthetic e(Lo/dkn;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/dkn;->k()V

    return-void
.end method

.method static synthetic e(Lo/dkn;Landroid/content/Context;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/dkn;->e(Landroid/content/Context;)V

    return-void
.end method

.method private e([B)V
    .locals 6

    .line 795
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent enter... data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 797
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    array-length v0, p1

    if-ge v4, v0, :cond_2

    .line 798
    aget-byte v0, p1, v4

    const/16 v1, 0x12

    if-ne v1, v0, :cond_1

    .line 799
    add-int/lit8 v0, v4, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_0

    .line 800
    const/16 v0, 0x9

    new-array v5, v0, [B

    .line 802
    array-length v0, v5

    const/4 v1, 0x0

    const/16 v0, 0x9

    invoke-static {p1, v4, v5, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 803
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkn;->l:Z

    .line 804
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent mIsSupportYellow = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dkn;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    const/4 v0, 0x5

    invoke-direct {p0, v5, v0}, Lo/dkn;->c([BI)V

    .line 806
    goto :goto_1

    :cond_0
    add-int/lit8 v0, v4, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x6

    if-ne v1, v0, :cond_1

    .line 807
    const/16 v0, 0x9

    new-array v5, v0, [B

    .line 809
    array-length v0, v5

    const/4 v1, 0x0

    const/16 v0, 0x9

    invoke-static {p1, v4, v5, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 810
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkn;->m:Z

    .line 811
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent mIsSupportSign = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dkn;->m:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 812
    const/4 v0, 0x6

    invoke-direct {p0, v5, v0}, Lo/dkn;->c([BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 797
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 818
    :cond_2
    goto :goto_2

    .line 816
    :catch_0
    move-exception v4

    .line 817
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==unNotificationContent ,Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    :goto_2
    return-void
.end method

.method private f()V
    .locals 4

    .line 378
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " resetAbility() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    const/16 v0, 0x1e

    iput v0, p0, Lo/dkn;->f:I

    .line 382
    const/16 v0, 0x1e

    iput v0, p0, Lo/dkn;->n:I

    .line 384
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkn;->l:Z

    .line 386
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkn;->m:Z

    .line 388
    const/4 v0, 0x2

    iput v0, p0, Lo/dkn;->p:I

    .line 390
    const/4 v0, 0x2

    iput v0, p0, Lo/dkn;->o:I

    .line 391
    return-void
.end method

.method static synthetic g()Landroid/content/Context;
    .locals 1

    .line 55
    sget-object v0, Lo/dkn;->c:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 7

    .line 353
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 354
    invoke-direct {p0}, Lo/dkn;->f()V

    .line 355
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 356
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendNotificationConstraint isMessage_alert = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    const/16 v0, 0xf0

    iput v0, p0, Lo/dkn;->i:I

    .line 360
    invoke-virtual {p0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 361
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 362
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 363
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 366
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 367
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 369
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 370
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendCapabilityCmd() 5.2.2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    :cond_0
    return-void
.end method

.method private k()V
    .locals 7

    .line 223
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 224
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 225
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushPromptToDevice isPromptPush = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPromptPush()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPromptPush()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 228
    invoke-virtual {p0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 229
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 230
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 231
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 234
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 235
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 236
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 237
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendCapabilityCmd() 5.2.5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    .line 408
    sget v0, Lo/dkn;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/dkn;->b:I

    .line 409
    sget v0, Lo/dkn;->b:I

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    .line 410
    const/4 v0, 0x0

    sput v0, Lo/dkn;->b:I

    .line 412
    :cond_0
    return-void
.end method

.method private m()Z
    .locals 5

    .line 596
    invoke-virtual {p0}, Lo/dkn;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 598
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 599
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNeedEncrypt Encrypt type ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getEncryptType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getEncryptType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 601
    const/4 v0, 0x1

    return v0

    .line 604
    :cond_0
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encryptTLVs getCurrentDeviceInfo() = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private o()V
    .locals 4

    .line 864
    iget-object v0, p0, Lo/dkn;->t:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 865
    iget-object v0, p0, Lo/dkn;->t:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/32 v2, 0x36ee80

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 867
    invoke-direct {p0}, Lo/dkn;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 868
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCheckService isAuthorizeEnabled ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    sget-object v0, Lo/dkn;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dkn$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/dkn$c;-><init>(Lo/dkn;Lo/dkn$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 871
    :cond_0
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCheckService isAuthorizeEnabled is not"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    return-void

    .line 874
    :goto_0
    return-void
.end method

.method private p()Z
    .locals 9

    .line 895
    sget-object v0, Lo/dkn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 896
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isEnabled pkgName : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    sget-object v0, Lo/dkn;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "enabled_notification_listeners"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 898
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 899
    const-string v0, ":"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 900
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_1

    .line 901
    aget-object v0, v6, v7

    invoke-static {v0}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v8

    .line 902
    if-eqz v8, :cond_0

    .line 903
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isEnabled cn.getPackageName : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 904
    invoke-virtual {v8}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 905
    const/4 v0, 0x1

    return v0

    .line 900
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 910
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 638
    const/4 v1, -0x1

    .line 640
    invoke-virtual {p0}, Lo/dkn;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 641
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 642
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    .line 644
    :cond_0
    return v1
.end method

.method public a(IZLjava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZLjava/util/List<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;Ljava/lang/String;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;"
        }
    .end annotation

    .line 434
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "meg pkg name :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "msgType= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p0

    iget v4, v4, Lo/dkn;->p:I

    move-object/from16 v5, p0

    iget v5, v5, Lo/dkn;->o:I

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, Lo/dkr;->e(IZLjava/util/List;Ljava/util/List;IILjava/lang/String;)Lo/daf;

    move-result-object v7

    .line 436
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    invoke-direct/range {p0 .. p0}, Lo/dkn;->l()V

    .line 441
    invoke-virtual {v7}, Lo/daf;->b()I

    move-result v10

    .line 442
    invoke-virtual {v7}, Lo/daf;->c()I

    move-result v11

    .line 443
    invoke-virtual {v7}, Lo/daf;->d()Ljava/lang/String;

    move-result-object v12

    .line 446
    const/4 v13, 0x1

    .line 447
    sget v14, Lo/dkn;->b:I

    .line 448
    const-string v15, ""

    .line 449
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v14}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 450
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, messageIdTlv---------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 453
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, messageTypeTlvHex---------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 456
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, motor_enableTlvHex---------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    const-string v18, ""

    .line 459
    const-string v19, ""

    .line 460
    const-string v20, ""

    .line 461
    const-string v21, ""

    .line 462
    const-string v22, ""

    .line 464
    invoke-virtual {v7}, Lo/daf;->e()Ljava/util/ArrayList;

    move-result-object v23

    .line 465
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, IsSupportYellow : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-boolean v3, v3, Lo/dkn;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; YellowPagesLength : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/dkn;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; YellowPagesFomat : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/dkn;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; IsSupportSign : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-boolean v3, v3, Lo/dkn;->m:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; ContentSignLength : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/dkn;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; ContentSignFomat : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/dkn;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/dkn;->l:Z

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lo/dkn;->m:Z

    move-object/from16 v2, p0

    iget v2, v2, Lo/dkn;->i:I

    move-object/from16 v3, p0

    iget v3, v3, Lo/dkn;->f:I

    move-object/from16 v4, p0

    iget v4, v4, Lo/dkn;->n:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/dkr;->d(ZZIII)V

    .line 468
    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v3, v23

    invoke-static {v9, v0, v1, v2, v3}, Lo/dkr;->b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v21

    .line 470
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/dkn;->a(I)Ljava/lang/String;

    move-result-object v24

    .line 471
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 472
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x84

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    goto :goto_0

    .line 474
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 476
    :goto_0
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS, message_content_structTlvHex---------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    const-string v25, ""

    .line 479
    const-string v26, ""

    .line 480
    const-string v27, ""

    .line 482
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_2

    const-string v0, ""

    move-object/from16 v1, p5

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 483
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgPkg is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    invoke-static {v12}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    .line 485
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "messagePkgNameHex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v26

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    sget v28, Lo/dkn;->r:I

    .line 487
    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move/from16 v1, v28

    if-le v0, v1, :cond_1

    .line 488
    mul-int/lit8 v0, v28, 0x2

    move-object/from16 v1, v16

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v26

    .line 489
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "substring messagePkgNameHex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v26

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x11

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    .line 492
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "messagePkgNameTLV ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v25

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    .line 495
    goto :goto_1

    .line 496
    :cond_2
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgPkg is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    .line 499
    :goto_1
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationMsgToTLVS sCmd---------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    new-instance v28, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct/range {v28 .. v28}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 502
    move-object/from16 v0, v28

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 503
    move-object/from16 v0, v28

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 504
    invoke-direct/range {p0 .. p0}, Lo/dkn;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 505
    move-object/from16 v0, v28

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedEncrypt(Z)V

    goto :goto_2

    .line 507
    :cond_3
    move-object/from16 v0, v28

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedEncrypt(Z)V

    .line 510
    :goto_2
    invoke-static/range {v27 .. v27}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 511
    invoke-static/range {v27 .. v27}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 512
    return-object v28
.end method

.method public b()V
    .locals 5

    .line 725
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter send3RDCallingOffMessage."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 727
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 728
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 729
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 730
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 731
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 734
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0, v4}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 735
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 672
    return-void
.end method

.method public b([B)V
    .locals 6

    .line 247
    array-length v0, p1

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 248
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCapability ,length < 5, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    return-void

    .line 252
    :cond_0
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_2

    .line 253
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    and-int/lit8 v4, v0, 0x1

    .line 254
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCapability ,mIsSupportMessage value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    shr-int/lit8 v0, v0, 0x1

    and-int/lit8 v4, v0, 0x1

    .line 256
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCapability ,mIsSupportPrompt value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 259
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkn;->g:Z

    goto :goto_0

    .line 261
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dkn;->g:Z

    .line 263
    :goto_0
    goto/16 :goto_1

    :cond_2
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 264
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCapability ,COMMAND_ID_MESSAGE_CONSTRAINT data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :try_start_0
    invoke-direct {p0, p1}, Lo/dkn;->a([B)Lo/dkk;

    move-result-object v4

    .line 267
    invoke-virtual {v4}, Lo/dkk;->c()I

    move-result v5

    .line 268
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCapability ,getContentLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    div-int/lit8 v0, v5, 0x6

    mul-int/lit8 v5, v0, 0x6

    .line 271
    if-lez v5, :cond_3

    .line 272
    iput v5, p0, Lo/dkn;->i:I

    .line 274
    :cond_3
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCapability ,mContentLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkn;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    invoke-direct {p0, p1}, Lo/dkn;->e([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    goto :goto_1

    .line 277
    :catch_0
    move-exception v4

    .line 278
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCapability ,Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    :cond_4
    :goto_1
    return-void
.end method

.method public c()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 615
    sget-object v4, Lo/dkn;->v:Ljava/lang/Object;

    monitor-enter v4

    .line 617
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 620
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 621
    monitor-exit v4

    return-object v5

    .line 623
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v5

    .line 624
    monitor-exit v4

    return-object v5

    .line 626
    :catch_0
    move-exception v5

    .line 627
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() error = "

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
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 628
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 630
    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6
.end method

.method public d()V
    .locals 4

    .line 678
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setV0CallingMessageContent."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 6

    .line 703
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter send3RDCallingOnMessage."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 706
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 707
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 708
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 709
    invoke-static {p1}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v5

    .line 710
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 711
    array-length v0, v5

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 712
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 715
    :cond_0
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0, v4}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 716
    goto :goto_0

    .line 717
    :cond_1
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "phoneNumber is invalid."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    :goto_0
    return-void
.end method

.method public e(I)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 7

    .line 828
    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 829
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 830
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 831
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 832
    const/4 v0, 0x6

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 833
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedEncrypt(Z)V

    .line 834
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 835
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteMsgToTLVS  command: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 837
    return-object v6
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;Lo/dag;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 3

    .line 524
    invoke-static {p2, p1}, Lo/dkr;->a(Lo/dag;Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;)Ljava/lang/String;

    move-result-object v1

    .line 525
    new-instance v2, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 526
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 527
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 528
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedEncrypt(Z)V

    .line 529
    invoke-static {v1}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 530
    invoke-static {v1}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 531
    return-object v2
.end method

.method public e()V
    .locals 5

    .line 398
    :try_start_0
    sget-object v0, Lo/dkn;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dkn;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 403
    goto :goto_0

    .line 399
    :catch_0
    move-exception v4

    .line 400
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    goto :goto_0

    .line 401
    :catch_1
    move-exception v4

    .line 402
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;I)V
    .locals 6

    .line 542
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->i()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 543
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendNotificationCmd error, BTSwitchState is OFF"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    return-void

    .line 547
    :cond_0
    invoke-virtual {p0}, Lo/dkn;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 548
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 549
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendNotificationCmd error, getCurrentDeviceInfo() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    return-void

    .line 552
    :cond_1
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendNotificationCmd DeviceConnectState ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_4

    .line 555
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_4

    .line 556
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x5

    if-eq v1, v0, :cond_4

    .line 558
    iget-object v0, p0, Lo/dkn;->d:Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 559
    iput-object p1, p0, Lo/dkn;->d:Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    .line 560
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeviceCommand data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkn;->d:Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-virtual {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

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

    .line 562
    :cond_2
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendNotificationCmd mIsForceConnect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dkn;->k:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    iget-boolean v0, p0, Lo/dkn;->k:Z

    if-eqz v0, :cond_3

    .line 564
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->b(Z)V

    .line 566
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dkn;->k:Z

    .line 568
    :cond_3
    iput p2, p0, Lo/dkn;->h:I

    goto/16 :goto_0

    .line 570
    :cond_4
    iput p2, p0, Lo/dkn;->h:I

    .line 571
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendNotificationCmd mMessageType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dkn;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    iget v0, p0, Lo/dkn;->h:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 574
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 575
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushPromptToDevice isPromptPush = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPromptPush()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPromptPush()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_5

    .line 578
    iget-boolean v0, p0, Lo/dkn;->g:Z

    if-nez v0, :cond_6

    .line 579
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushPromptToDevice, mIsSupportPrompt is false,device not support prompt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    return-void

    .line 582
    :cond_5
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPromptPush()I

    move-result v0

    shr-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    .line 583
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushPromptToDevice, deviceCapability.isPromptPush() is false,device not support prompt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    return-void

    .line 587
    :cond_6
    iget-object v0, p0, Lo/dkn;->e:Lo/dea;

    invoke-virtual {v0, p1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 589
    :goto_0
    return-void
.end method

.method public i()Z
    .locals 1

    .line 929
    iget-boolean v0, p0, Lo/dkn;->g:Z

    return v0
.end method
