.class public Lo/cur;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/cla;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/concurrent/ExecutorService;

.field private d:Landroid/os/Handler;

.field private e:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cur;->a:Landroid/content/Context;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cur;->c:Ljava/util/concurrent/ExecutorService;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cur;->b:Ljava/util/Map;

    .line 42
    new-instance v0, Lo/cur$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cur$1;-><init>(Lo/cur;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cur;->d:Landroid/os/Handler;

    .line 104
    new-instance v0, Lo/cur$5;

    invoke-direct {v0, p0}, Lo/cur$5;-><init>(Lo/cur;)V

    iput-object v0, p0, Lo/cur;->e:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic b(Lo/cur;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/cur;->c:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private b(Lo/cla;ILjava/util/List;)V
    .locals 5

    .line 141
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 142
    return-void

    .line 146
    :cond_0
    :try_start_0
    invoke-interface {p1, p2, p3}, Lo/cla;->e(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 151
    goto :goto_0

    .line 147
    :catch_0
    move-exception v4

    .line 148
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ICommonListener setSuccess  e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    goto :goto_0

    .line 149
    :catch_1
    move-exception v4

    .line 150
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ICommonListener setSuccess  exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    :goto_0
    return-void
.end method

.method private c(Lo/cla;ILjava/util/List;)V
    .locals 5

    .line 155
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 156
    return-void

    .line 160
    :cond_0
    :try_start_0
    invoke-interface {p1, p2, p3}, Lo/cla;->d(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 165
    goto :goto_0

    .line 161
    :catch_0
    move-exception v4

    .line 162
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ICommonListener setFail  e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    goto :goto_0

    .line 163
    :catch_1
    move-exception v4

    .line 164
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ICommonListener setSuccess  exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/cur;)Landroid/os/Handler;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/cur;->d:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lo/cur;Ljava/util/HashMap;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/cur;->e(Ljava/util/HashMap;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lo/cur;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lo/cur;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :cond_0
    return-void
.end method

.method private e(Ljava/util/HashMap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 77
    const-string v0, "uuid"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 78
    const-string v0, "result"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 79
    iget-object v0, p0, Lo/cur;->b:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cla;

    .line 80
    if-nez v6, :cond_0

    .line 81
    return-void

    .line 83
    :cond_0
    iget-object v0, p0, Lo/cur;->b:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    if-nez v5, :cond_1

    .line 86
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transcation success:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 88
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    const/4 v0, 0x0

    invoke-direct {p0, v6, v0, v7}, Lo/cur;->b(Lo/cla;ILjava/util/List;)V

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transcation fail:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 93
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    const/16 v0, 0xe

    invoke-direct {p0, v6, v0, v7}, Lo/cur;->c(Lo/cla;ILjava/util/List;)V

    .line 96
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/cur;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/cur;->e(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;Lo/cla;)V
    .locals 5

    .line 134
    const-string v0, "HiTranscation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transcation begin:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lo/cur;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    iget-object v0, p0, Lo/cur;->d:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 137
    iget-object v0, p0, Lo/cur;->d:Landroid/os/Handler;

    const-wide/16 v1, 0x4e20

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 138
    return-void
.end method

.method public d()V
    .locals 2

    .line 130
    iget-object v0, p0, Lo/cur;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/cur;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 131
    return-void
.end method

.method public d(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
    .locals 5

    .line 124
    iput-object p1, p0, Lo/cur;->a:Landroid/content/Context;

    .line 125
    iput-object p2, p0, Lo/cur;->c:Ljava/util/concurrent/ExecutorService;

    .line 126
    iget-object v0, p0, Lo/cur;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/cur;->e:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "action_transcation_end"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sget-object v3, Lo/dac;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 127
    return-void
.end method
