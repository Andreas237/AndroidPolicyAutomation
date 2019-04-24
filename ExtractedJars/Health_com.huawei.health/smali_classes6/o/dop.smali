.class public abstract Lo/dop;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lo/dot;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lo/dot;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private e:Ljava/lang/String;

.field private f:Landroid/content/Context;

.field private k:Lo/dnx;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lo/dnx;)V
    .locals 2

    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 24
    const-string v0, "MSGHandler"

    iput-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/dop;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/dop;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dop;->c:Ljava/util/Map;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dop;->a:Ljava/util/Map;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dop;->f:Landroid/content/Context;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dop;->k:Lo/dnx;

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dop;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    .line 48
    iput-object p1, p0, Lo/dop;->f:Landroid/content/Context;

    .line 50
    iput-object p3, p0, Lo/dop;->k:Lo/dnx;

    .line 52
    new-instance v0, Lo/dop$3;

    invoke-direct {v0, p0}, Lo/dop$3;-><init>(Lo/dop;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lo/dop;->d(ILo/dot;)V

    .line 61
    new-instance v0, Lo/dop$2;

    invoke-direct {v0, p0}, Lo/dop$2;-><init>(Lo/dop;)V

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lo/dop;->e(ILo/dot;)V

    .line 70
    new-instance v0, Lo/dop$5;

    invoke-direct {v0, p0}, Lo/dop$5;-><init>(Lo/dop;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dop;->e(ILo/dot;)V

    .line 81
    new-instance v0, Lo/dop$1;

    invoke-direct {v0, p0}, Lo/dop$1;-><init>(Lo/dop;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dop;->e(ILo/dot;)V

    .line 88
    new-instance v0, Lo/dop$4;

    invoke-direct {v0, p0}, Lo/dop$4;-><init>(Lo/dop;)V

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lo/dop;->e(ILo/dot;)V

    .line 97
    return-void
.end method

.method static synthetic a(Lo/dop;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/dop;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private a(Landroid/os/Message;)Z
    .locals 5

    .line 196
    iget-object v0, p0, Lo/dop;->a:Ljava/util/Map;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dot;

    .line 197
    if-eqz v4, :cond_0

    .line 198
    invoke-virtual {v4, p1}, Lo/dot;->b(Landroid/os/Message;)V

    .line 199
    const/4 v0, 0x1

    return v0

    .line 201
    :cond_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "routingRunningMsg fail:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/dop;)Landroid/content/Context;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/dop;->f:Landroid/content/Context;

    return-object v0
.end method

.method private c(Landroid/os/Message;)Z
    .locals 5

    .line 186
    iget-object v0, p0, Lo/dop;->c:Ljava/util/Map;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dot;

    .line 187
    if-eqz v4, :cond_0

    .line 188
    invoke-virtual {v4, p1}, Lo/dot;->b(Landroid/os/Message;)V

    .line 189
    const/4 v0, 0x1

    return v0

    .line 191
    :cond_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "routingEscapeMsg fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/dop;)Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/dop;)Lo/dnx;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/dop;->k:Lo/dnx;

    return-object v0
.end method

.method private e(Landroid/os/Message;)Z
    .locals 3

    .line 146
    iget v2, p1, Landroid/os/Message;->what:I

    .line 147
    iget-object v0, p0, Lo/dop;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    invoke-direct {p0, p1}, Lo/dop;->c(Landroid/os/Message;)Z

    move-result v0

    return v0

    .line 150
    :cond_0
    iget-object v0, p0, Lo/dop;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    invoke-direct {p0, p1}, Lo/dop;->a(Landroid/os/Message;)Z

    move-result v0

    return v0

    .line 153
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 179
    move-object v4, p0

    monitor-enter v4

    .line 180
    :try_start_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unBlockMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/dop;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 183
    :goto_0
    return-void
.end method

.method public b()V
    .locals 6

    .line 172
    move-object v4, p0

    monitor-enter v4

    .line 173
    :try_start_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "blockMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lo/dop;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 176
    :goto_0
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 4

    .line 100
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_INIT sendToTarget"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lo/dop;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 102
    return-void
.end method

.method public c(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 2

    .line 110
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 111
    const-string v0, "userInfo"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    const-string v0, "callback"

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lo/dop;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 115
    return-void
.end method

.method public c()Z
    .locals 4

    .line 105
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInit,mInited.get:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dop;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lo/dop;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public d(ILo/dot;)V
    .locals 6

    .line 157
    move-object v4, p0

    monitor-enter v4

    .line 158
    :try_start_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addEscapeMsg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lo/dop;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 161
    :goto_0
    return-void
.end method

.method public e(II)V
    .locals 4

    .line 118
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postResult arg what:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 121
    :sswitch_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dop;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 122
    goto :goto_0

    .line 125
    :sswitch_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lo/dop;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 126
    .line 132
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public e(ILo/dot;)V
    .locals 6

    .line 164
    move-object v4, p0

    monitor-enter v4

    .line 165
    :try_start_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunningMsg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lo/dop;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 168
    :goto_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 136
    move-object v4, p0

    monitor-enter v4

    .line 137
    :try_start_0
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg handle:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lo/dop;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg handle:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-direct {p0, p1}, Lo/dop;->e(Landroid/os/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 143
    :goto_0
    return-void
.end method
