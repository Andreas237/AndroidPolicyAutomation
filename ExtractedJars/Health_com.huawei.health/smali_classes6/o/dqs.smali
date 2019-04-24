.class public Lo/dqs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dqs$c;,
        Lo/dqs$b;,
        Lo/dqs$e;
    }
.end annotation


# static fields
.field private static final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dqr;>;"
        }
    .end annotation
.end field

.field private static final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lo/dqm;Lo/dqs$c;>;"
        }
    .end annotation
.end field

.field private static final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dqm;>;"
        }
    .end annotation
.end field

.field private static final n:Ljava/lang/Object;

.field private static o:I


# instance fields
.field private a:Lo/dsr;

.field private b:Landroid/os/HandlerThread;

.field private c:Lo/dsu;

.field private d:Landroid/content/Context;

.field private e:Lo/dqs$b;

.field private g:Ljava/lang/String;

.field private i:Z

.field private l:Landroid/os/IBinder$DeathRecipient;

.field private m:Lo/dsw$d;

.field private p:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dqs;->h:Ljava/util/HashMap;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dqs;->k:Ljava/util/ArrayList;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dqs;->f:Ljava/util/ArrayList;

    .line 130
    const/4 v0, 0x1

    sput v0, Lo/dqs;->o:I

    .line 192
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dqs;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->e:Lo/dqs$b;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->c:Lo/dsu;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->a:Lo/dsr;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->g:Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dqs;->i:Z

    .line 460
    new-instance v0, Lo/dqs$5;

    invoke-direct {v0, p0}, Lo/dqs$5;-><init>(Lo/dqs;)V

    iput-object v0, p0, Lo/dqs;->m:Lo/dsw$d;

    .line 853
    new-instance v0, Lo/dqs$2;

    invoke-direct {v0, p0}, Lo/dqs$2;-><init>(Lo/dqs;)V

    iput-object v0, p0, Lo/dqs;->p:Landroid/content/ServiceConnection;

    .line 905
    new-instance v0, Lo/dqs$3;

    invoke-direct {v0, p0}, Lo/dqs$3;-><init>(Lo/dqs;)V

    iput-object v0, p0, Lo/dqs;->l:Landroid/os/IBinder$DeathRecipient;

    return-void
.end method

.method static synthetic a(Lo/dqs;Lo/dsr;)Lo/dsr;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/dqs;->a:Lo/dsr;

    return-object p1
.end method

.method static synthetic a(Lo/dqs;Lo/dsu;)Lo/dsu;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/dqs;->c:Lo/dsu;

    return-object p1
.end method

.method private a(I)V
    .locals 7

    .line 839
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Notify service connected status changed, service status = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 841
    sget-object v4, Lo/dqs;->f:Ljava/util/ArrayList;

    monitor-enter v4

    .line 842
    :try_start_0
    sget-object v0, Lo/dqs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 843
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 845
    :goto_0
    const/4 v5, 0x0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    :goto_1
    if-ge v5, v6, :cond_1

    .line 846
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dqr;

    .line 847
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 848
    invoke-interface {v4, p1}, Lo/dqr;->e(I)V

    .line 845
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 851
    :cond_1
    return-void
.end method

.method static synthetic a(Lo/dqs;Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dqs;->c(Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic a(Lo/dqs;Landroid/os/Message;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dqs;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lo/dqs;)Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lo/dqs;->i:Z

    return v0
.end method

.method static synthetic b()Ljava/util/HashMap;
    .locals 1

    .line 39
    sget-object v0, Lo/dqs;->h:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic b(Lo/dqs;)Lo/dsw$d;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dqs;->m:Lo/dsw$d;

    return-object v0
.end method

.method private b(Landroid/os/Message;)V
    .locals 8

    .line 383
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 384
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle download profile callback failed, msg is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 385
    return-void

    .line 387
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 388
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 392
    sget-object v6, Lo/dqs;->h:Ljava/util/HashMap;

    monitor-enter v6

    .line 393
    :try_start_0
    sget-object v0, Lo/dqs;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 394
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 395
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 396
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle download profile callback failed, CommonCallbacks is null."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 397
    return-void

    .line 399
    :cond_1
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 400
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dqs$c;

    .line 401
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dqm;

    invoke-virtual {v0}, Lo/dqm;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 402
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle download profile callback, MSG_DOWNLOAD_PROFILE: get attached device multi-sim info."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 403
    const/4 v0, 0x5

    invoke-direct {p0, v5, v0, v3, v2}, Lo/dqs;->c(Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 405
    :cond_2
    goto :goto_1

    .line 406
    :cond_3
    return-void
.end method

.method static synthetic b(Lo/dqs;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dqs;->a(I)V

    return-void
.end method

.method static synthetic b(Lo/dqs;Landroid/os/Message;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dqs;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lo/dqs;)Lo/dqs$b;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dqs;->e:Lo/dqs$b;

    return-object v0
.end method

.method public static c()Lo/dqs;
    .locals 3

    .line 195
    sget-object v1, Lo/dqs;->n:Ljava/lang/Object;

    monitor-enter v1

    .line 196
    :try_start_0
    sget-object v0, Lo/dqs$e;->b:Lo/dqs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 197
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V
    .locals 5

    .line 100
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 101
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Send message failed, handler is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    return-void

    .line 104
    :cond_0
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    .line 105
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 106
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Send message failed, looper is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    return-void

    .line 109
    :cond_1
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    .line 110
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 111
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Send message failed, thread is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    return-void

    .line 114
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_3

    .line 115
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Send message failed, the state of the thread is not alive."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    return-void

    .line 118
    :cond_3
    invoke-virtual {p1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 119
    iput p2, v4, Landroid/os/Message;->what:I

    .line 120
    invoke-virtual {v4, p4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 121
    const/4 v0, 0x0

    if-eq v0, p3, :cond_4

    .line 122
    iput-object p3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 124
    :cond_4
    invoke-virtual {p1, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 125
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 7

    .line 436
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 437
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle get attached device multi-sim info failed, msg is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 438
    return-void

    .line 440
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 444
    sget-object v5, Lo/dqs;->h:Ljava/util/HashMap;

    monitor-enter v5

    .line 445
    :try_start_0
    sget-object v0, Lo/dqs;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 447
    :goto_0
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 448
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dqs$c;

    .line 449
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dqm;

    invoke-virtual {v0}, Lo/dqm;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 450
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle get attached device multi-sim info, MSG_GET_DEVICE_INFO_CALLBACK: get attached device multi-sim info."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 451
    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-direct {p0, v4, v0, v1, v2}, Lo/dqs;->c(Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    goto :goto_2

    .line 452
    :cond_1
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dqm;

    invoke-virtual {v0}, Lo/dqm;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 453
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle get attached device multi-sim info, MSG_IS_NEED_DOWNLOAD_PROFILE_CALLBACK: whether need download profile."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 454
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v4, v0, v1, v2}, Lo/dqs;->c(Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 456
    :cond_2
    :goto_2
    goto :goto_1

    .line 457
    :cond_3
    return-void
.end method

.method static synthetic c(Lo/dqs;Landroid/content/ComponentName;)Z
    .locals 1

    .line 39
    invoke-direct {p0, p1}, Lo/dqs;->d(Landroid/content/ComponentName;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/dqs;)Lo/dsr;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dqs;->a:Lo/dsr;

    return-object v0
.end method

.method private d(Landroid/os/Message;)V
    .locals 7

    .line 410
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 411
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle delete profile callback, msg is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    return-void

    .line 414
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 418
    sget-object v5, Lo/dqs;->h:Ljava/util/HashMap;

    monitor-enter v5

    .line 419
    :try_start_0
    sget-object v0, Lo/dqs;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 421
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 422
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle delete profile callback, CommonCallbacks is null."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 423
    return-void

    .line 425
    :cond_1
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 426
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dqs$c;

    .line 427
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dqm;

    invoke-virtual {v0}, Lo/dqm;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 428
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Handle delete profile callback, MSG_DELETE_PROFILE_CALLBACK: get attached device multi-sim info."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 429
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v4, v0, v1, v2}, Lo/dqs;->c(Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 431
    :cond_2
    goto :goto_1

    .line 432
    :cond_3
    return-void
.end method

.method private d(Landroid/content/ComponentName;)Z
    .locals 17

    .line 981
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 982
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Check service identity failed, component name is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 983
    const/4 v0, 0x0

    return v0

    .line 986
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 987
    const-string v0, "com.huawei.hwmultisim"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dqs;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 988
    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 989
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 991
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SdkInHwMultiSim = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", sdkPkgName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/dqs;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", servicePkgName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 993
    if-eqz v4, :cond_8

    .line 996
    if-nez v5, :cond_1

    if-nez v6, :cond_1

    .line 997
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Check service identity failed: service Package name is not the same with hw wear app"

    invoke-static {v0, v1}, Lo/dsc;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 998
    const/4 v0, 0x0

    return v0

    .line 1000
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dqs;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1001
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Check service identity failed: context is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 1002
    const/4 v0, 0x0

    return v0

    .line 1005
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dqs;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    .line 1006
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dqs;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/multisimsdk/multidevicemanager/R$string;->info_string_part_two:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1007
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dqs;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/multisimsdk/multidevicemanager/R$string;->info_string_part_three:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1008
    const-string v0, "1310403;132b3b330313231313760115605033g353:1b;57;;5e43g32323636330353023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:032f243g0207030002070301020203016b243g0707030003050301020203016b0353023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:03;2:e033g353:1b;57;;5e43g323232363330;2;g3303;2;:31;2;233;`eea3a0a6707342`7:f25f21g14410gb;5:236g3g75:03b1a153:5ag6e;:e72`a1g;a0e`a2g34a;;eb6g0ef655g671g5gb0516:e43725b37b`5ff7g3125;`07f2gb;4ff07f2:1e27422;fe7ff43f1;7fe5:6g701ab40e16ff4;1ee4::14a7031e14:4f:3:f4e320fg750`17b07g;a:65f76gf41f`eef0gb:b4a23554e2fgb`43130323332033g353:1b;57;;5e43g323236363330;2;2337;a`:33f31176;b`11;012:4g;febae;0g6g:4f3:6;2:efeefe5:45624b35g655;75fa;ba67a2:;e7:02:6:356f`:f3;7a03bg6b5b76a5gfggbb34`13bg3b4`g:a14361:04e3f:a0042:02e:e7::;5506f6;42;eg`g:7:72f3fa6;1g1;2`ae7bg7eg;`2a:;5`715:e11534g44:ff`e;f466567;:2e7a57456b:56f1067:53;6003;"

    invoke-static {v0, v8, v9}, Lo/dsn;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1009
    if-eqz v6, :cond_3

    .line 1010
    const-string v0, "137a603;130:gb330313231313:33e13765ba:57eb3e3033g353:1b;57;;5e43g323236363303;2:;023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:022703213530663730203a725f57415e5:576756525g0213032f353:1b;57;;5e43g323:3225225g5e515:5`56735;465244565:1f505e5g032f243g02020306010603050203070:6b243g00050306020;03050203070:6b03;2:;023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:022703213530663730203a725f57415e5:576756525g0213032f353:1b;57;;5e43g323:3225225g5e515:5`56735;465244565:1f505e5g03;13213033g353:1b;57;;5e43g323232363330;1323g3303;1323;31;1323233f31`6ba:4b1a0b;b6::5110`gf35a;1a1g7ee6a26`be56a;53g6`4b0g5;::6ba3;513aa46b11ef4540b;b2bab30f24a562g2e`7g6`agabf:f40fffbe6b2g7g1ea40f4333102f3ga1255g3e`6gg:4f436eg55675`:gb0;fg7feb1```gg10;bg01f0:;12171a32:6ge32g:a:4171gae13:fgb;f775f370177a;7f5ae`b4:g4aa0`2:17`gg17;fgag533fee;e40332b;:b7`550ga;:43f01;;a:702617`052f;60a;eb1:f37f52faf5eagag;4`gag0ffa74a314a6;62agfbb20b10e70:54b303f474fb701561`aa07eggf5237:ae6353`;20ea3f:0e5abg:g05e7g76622:6fb0aa7:f:132bb5ge:46bf25:f127:36gf164:g4``0`0fb`76:7a27b`2:g4f0:`6`154313230b0;1323303;2eg032g3530662g3f372537270f`5:3gf;22a`0:f62b03032bg10`e0335g54gf303;2`g3530662g1037;2`603;2`1;3270f`5:3gf;22a`0:f62b03032bg10`e0335g54gf3b2;2:fb7;2:a03;2:;023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:022703213530663730203a725f57415e5:576756525g0213032f353:1b;57;;5e43g323:3225225g5e515:5`56735;465244565:1f505e5g;13:33e13765ba:57eb3e3033`3530662g20373603303232ee033g353:1b;57;;5e43g323236363330;13232335gbg1e`6:3`e334:b`7`f3;56b;;7022g`25bg;0146b1a3031736445gg2g2e437b1:::0`;b207b;gegg67`6:262b35266521gag033575fb`e`:e57eb`1f06143:a306:e465be:5`2e657:6037f411;4af74:;b3700065`a``gg;g64`gf2e4ee2`337`a:51bg6:6a2gb11fe137gf277:3;;52aab:5;f3`470;2f22:`441a1`e11`0g3`;016b:e02`:4;4a265`:7442be55e7eea2bg::5`0eaf457e0a`63a4b1570`10041521e163::75b30abgeaefb52e;f0g1;:100;6aa`33;46b`f`::a5g:1b`75;e3g`63`3::4ee73:f0b16g`;g:55`13g6;;b:420ee124f1gf7:764b01`e10ge2be6;e7a`gg:7b;e15a`2`:3`6b62;0ga57g75060gg752374;`44e1`;::;;03;"

    invoke-static {v0, v8, v9}, Lo/dsn;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1013
    :cond_3
    const/16 v0, 0x40

    :try_start_0
    invoke-virtual {v7, v3, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v11

    .line 1014
    iget-object v0, v11, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-nez v0, :cond_4

    .line 1015
    const-string v0, "AttachedDeviceManager"

    const-string v1, "check service identity failed: signature is null"

    invoke-static {v0, v1}, Lo/dsc;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1016
    const/4 v0, 0x0

    return v0

    .line 1018
    :cond_4
    :try_start_1
    iget-object v12, v11, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v13, v12

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_7

    aget-object v15, v12, v14

    .line 1019
    const/4 v0, 0x0

    if-ne v0, v15, :cond_5

    .line 1020
    goto :goto_1

    .line 1022
    :cond_5
    invoke-virtual {v15}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v16

    .line 1023
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-eqz v0, :cond_6

    .line 1024
    const/4 v0, 0x1

    return v0

    .line 1018
    :cond_6
    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 1027
    :cond_7
    const/4 v0, 0x0

    return v0

    .line 1028
    :catch_0
    move-exception v11

    .line 1029
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Get package info exception: NameNotFoundException."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 1030
    const/4 v0, 0x0

    return v0

    .line 1035
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dqs;->g:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 1036
    if-eqz v7, :cond_9

    .line 1037
    const/4 v0, 0x1

    return v0

    .line 1039
    :cond_9
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sdk and service are not in the same App: sdk:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/dqs;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " service:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1040
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(I)I
    .locals 0

    .line 39
    sput p0, Lo/dqs;->o:I

    return p0
.end method

.method static synthetic e(Lo/dqs;)Landroid/os/IBinder$DeathRecipient;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dqs;->l:Landroid/os/IBinder$DeathRecipient;

    return-object v0
.end method

.method static synthetic e(Lo/dqs;Landroid/os/Message;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dqs;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lo/dqs;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/dqs;->i:Z

    return p1
.end method

.method static synthetic g()I
    .locals 1

    .line 39
    sget v0, Lo/dqs;->o:I

    return v0
.end method

.method static synthetic h(Lo/dqs;)Lo/dsu;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dqs;->c:Lo/dsu;

    return-object v0
.end method

.method static synthetic k()Ljava/util/ArrayList;
    .locals 1

    .line 39
    sget-object v0, Lo/dqs;->k:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 5

    .line 928
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempt to bindService: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lo/dqs;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 929
    iget-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 930
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Attempt to bindService failed, context is null, can\'t bind service."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 931
    const/4 v0, -0x1

    return v0

    .line 933
    :cond_0
    sget v0, Lo/dqs;->o:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 934
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Service is not connected yet, re-bind service."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 935
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 936
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    const-string v2, "com.huawei.multisimservice.MultiSimService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 938
    :try_start_0
    iget-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dqs;->p:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 942
    goto :goto_0

    .line 939
    :catch_0
    move-exception v4

    .line 940
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Bind service exception occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 941
    const/4 v0, -0x1

    return v0

    .line 944
    :cond_1
    :goto_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Bind service succeed."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 945
    const/4 v0, 0x0

    return v0
.end method

.method public c(Landroid/content/Context;)I
    .locals 3

    .line 207
    const-string v0, "AttachedDeviceManager"

    const-string v1, "AttachedDeviceManager init"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 209
    const-string v0, "AttachedDeviceManager"

    const-string v1, "AttachedDeviceManager init failed, context is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    const/4 v0, -0x1

    return v0

    .line 212
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    .line 213
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dqs;->g:Ljava/lang/String;

    .line 214
    iget-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 215
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "AttachedDeviceManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    .line 216
    iget-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 218
    :cond_1
    iget-object v0, p0, Lo/dqs;->e:Lo/dqs$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 219
    new-instance v0, Lo/dqs$b;

    iget-object v1, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lo/dqs$b;-><init>(Lo/dqs;Landroid/os/Looper;Lo/dqs$5;)V

    iput-object v0, p0, Lo/dqs;->e:Lo/dqs$b;

    .line 221
    :cond_2
    invoke-virtual {p0}, Lo/dqs;->a()I

    move-result v0

    return v0
.end method

.method public d()V
    .locals 6

    .line 228
    const-string v0, "AttachedDeviceManager"

    const-string v1, "AttachedDeviceManager is finished"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    invoke-virtual {p0}, Lo/dqs;->e()I

    .line 230
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    .line 231
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->g:Ljava/lang/String;

    .line 232
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->e:Lo/dqs$b;

    .line 233
    iget-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 234
    iget-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->b:Landroid/os/HandlerThread;

    .line 237
    :cond_0
    sget-object v2, Lo/dqs;->h:Ljava/util/HashMap;

    monitor-enter v2

    .line 238
    :try_start_0
    sget-object v0, Lo/dqs;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 240
    :goto_0
    sget-object v2, Lo/dqs;->k:Ljava/util/ArrayList;

    monitor-enter v2

    .line 241
    :try_start_1
    sget-object v0, Lo/dqs;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 242
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v4

    monitor-exit v2

    throw v4

    .line 243
    :goto_1
    sget-object v2, Lo/dqs;->f:Ljava/util/ArrayList;

    monitor-enter v2

    .line 244
    :try_start_2
    sget-object v0, Lo/dqs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 245
    monitor-exit v2

    goto :goto_2

    :catchall_2
    move-exception v5

    monitor-exit v2

    throw v5

    .line 246
    :goto_2
    return-void
.end method

.method public e()I
    .locals 4

    .line 954
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unbind service: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lo/dqs;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 955
    iget-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 956
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Unbind service failed, can\'t unbind service."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 957
    const/4 v0, -0x1

    return v0

    .line 959
    :cond_0
    sget v0, Lo/dqs;->o:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 961
    :try_start_0
    iget-object v0, p0, Lo/dqs;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/dqs;->p:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 962
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dqs;->a:Lo/dsr;

    .line 963
    const/4 v0, 0x1

    sput v0, Lo/dqs;->o:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 967
    goto :goto_0

    .line 964
    :catch_0
    move-exception v3

    .line 965
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Unbind service, IllegalArgumentException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 966
    const/4 v0, -0x1

    return v0

    .line 969
    :cond_1
    :goto_0
    sget v0, Lo/dqs;->o:I

    invoke-direct {p0, v0}, Lo/dqs;->a(I)V

    .line 970
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Unbind service succeed."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 971
    const/4 v0, 0x0

    return v0
.end method
