.class public final Lo/anv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;

.field private static final d:Lo/anv;


# instance fields
.field private a:Ljava/util/Timer;

.field private c:Lo/bbx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lo/anv;

    invoke-direct {v0}, Lo/anv;-><init>()V

    sput-object v0, Lo/anv;->d:Lo/anv;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/bbu;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/anv;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anv;->c:Lo/bbx;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anv;->a:Ljava/util/Timer;

    .line 63
    new-instance v0, Lo/bbx;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bbx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/anv;->c:Lo/bbx;

    .line 64
    return-void
.end method

.method static synthetic c(Lo/anv;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/anv;->k()V

    return-void
.end method

.method public static declared-synchronized e()Lo/anv;
    .locals 3

    const-class v1, Lo/anv;

    monitor-enter v1

    .line 73
    :try_start_0
    sget-object v0, Lo/anv;->d:Lo/anv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private g()V
    .locals 9

    .line 111
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v4

    .line 113
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->g()V

    .line 115
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 116
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 118
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v8

    .line 119
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clear Conversation DB num:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",Message DB num:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    invoke-static {v4, v5}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 121
    return-void
.end method

.method private k()V
    .locals 1

    .line 81
    const/4 v0, 0x0

    invoke-static {v0}, Lo/ayz;->d(Z)V

    .line 83
    invoke-direct {p0}, Lo/anv;->l()V

    .line 84
    return-void
.end method

.method private l()V
    .locals 1

    .line 151
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e()V

    .line 152
    return-void
.end method

.method private n()V
    .locals 4

    .line 215
    invoke-direct {p0}, Lo/anv;->o()V

    .line 216
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/anv;->a:Ljava/util/Timer;

    .line 218
    iget-object v0, p0, Lo/anv;->a:Ljava/util/Timer;

    invoke-direct {p0}, Lo/anv;->p()Ljava/util/TimerTask;

    move-result-object v1

    const-wide/32 v2, 0x927c0

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 219
    return-void
.end method

.method private o()V
    .locals 1

    .line 226
    iget-object v0, p0, Lo/anv;->a:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/anv;->a:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anv;->a:Ljava/util/Timer;

    .line 231
    :cond_0
    return-void
.end method

.method private p()Ljava/util/TimerTask;
    .locals 1

    .line 240
    new-instance v0, Lo/anv$1;

    invoke-direct {v0, p0}, Lo/anv$1;-><init>(Lo/anv;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/database/Cursor;
    .locals 1

    .line 143
    new-instance v0, Lo/any;

    invoke-direct {v0}, Lo/any;-><init>()V

    invoke-virtual {v0}, Lo/any;->d()Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 0

    .line 102
    invoke-direct {p0}, Lo/anv;->o()V

    .line 103
    invoke-direct {p0}, Lo/anv;->k()V

    .line 104
    return-void
.end method

.method public c()Landroid/database/Cursor;
    .locals 4

    .line 131
    invoke-static {}, Lo/anu;->a()Landroid/database/Cursor;

    move-result-object v3

    .line 132
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Back up message cursor num:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    return-object v3
.end method

.method public d()V
    .locals 1

    .line 92
    const/4 v0, 0x1

    invoke-static {v0}, Lo/ayz;->d(Z)V

    .line 93
    invoke-direct {p0}, Lo/anv;->g()V

    .line 94
    invoke-direct {p0}, Lo/anv;->n()V

    .line 95
    return-void
.end method

.method f()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/anv;->c:Lo/bbx;

    invoke-virtual {v0}, Lo/bbx;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method h()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lo/anv;->c:Lo/bbx;

    invoke-virtual {v0}, Lo/bbx;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 161
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 163
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    return-object v3

    .line 168
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/anv;->c:Lo/bbx;

    invoke-virtual {v1}, Lo/bbx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/anv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 169
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "external"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/anv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    :cond_1
    iget-object v0, p0, Lo/anv;->c:Lo/bbx;

    invoke-virtual {v0}, Lo/bbx;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/anv;->c:Lo/bbx;

    invoke-virtual {v1}, Lo/bbx;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/anv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 179
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "externalstorage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/anv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    :cond_2
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNS File Storage Path size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    return-object v3
.end method
