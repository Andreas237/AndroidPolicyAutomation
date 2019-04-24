.class public Lo/dhn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/dia;

.field private static final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 45
    const/4 v0, 0x0

    sput-object v0, Lo/dhn;->b:Lo/dia;

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dhn;->d:Ljava/lang/Object;

    .line 52
    new-instance v0, Lo/dia;

    const-string v1, "LogSensor"

    invoke-direct {v0, v1}, Lo/dia;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/dhn;->b:Lo/dia;

    .line 53
    new-instance v0, Lo/dhn$2;

    invoke-direct {v0}, Lo/dhn$2;-><init>()V

    invoke-static {v0}, Lo/dhu;->e(Lo/dhu$b;)V

    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 6

    .line 109
    sget-object v4, Lo/dhn;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 110
    :try_start_0
    sget-object v0, Lo/dhn;->b:Lo/dia;

    invoke-virtual {v0}, Lo/dia;->e()V

    .line 111
    const-string v0, "LogSensor"

    const-string v1, "blockForAnalyze"

    invoke-static {v0, v1}, Lo/dhn;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    sget-object v0, Lo/dhn;->b:Lo/dia;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dia;->e(Z)V

    .line 113
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/dhn$1;

    invoke-direct {v1}, Lo/dhn$1;-><init>()V

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 119
    :goto_0
    return-void
.end method

.method public static a([B)V
    .locals 2

    .line 87
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 88
    :cond_0
    const-string v0, "LogSensor"

    const-string v1, "LogSensor empty message return"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    return-void

    .line 91
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lo/dhn;->d(Z[B)V

    .line 92
    return-void
.end method

.method public static c()V
    .locals 5

    .line 62
    sget-object v0, Lo/dhn;->b:Lo/dia;

    invoke-virtual {v0}, Lo/dia;->a()V

    .line 64
    const-string v0, "LogSensor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clearLogCache start in process:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lo/dio;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " pid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 65
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 64
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    const-string v0, "sensor"

    invoke-static {v0}, Lo/dhu;->d(Ljava/lang/String;)Lo/dhu;

    move-result-object v3

    .line 69
    if-nez v3, :cond_0

    .line 70
    const-string v0, "LogSensor"

    const-string v1, "clearLogCache,logConfig null,return"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    return-void

    .line 73
    :cond_0
    invoke-static {v3}, Lo/dhw;->a(Lo/dhu;)Lo/dhw$c;

    move-result-object v4

    .line 74
    if-nez v4, :cond_1

    .line 76
    const-string v0, "LogSensor"

    const-string v1, "clearLogCache,writeLock null,return"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    return-void

    .line 80
    :cond_1
    invoke-virtual {v4}, Lo/dhw$c;->d()V

    .line 81
    invoke-virtual {v4}, Lo/dhw$c;->a()V

    .line 82
    const-string v0, "LogSensor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clearLogCache end in process:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lo/dio;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " pid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 83
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 129
    const-string v0, "LogSensor"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    return-void
.end method

.method public static d()V
    .locals 4

    .line 122
    sget-object v2, Lo/dhn;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 123
    const-string v0, "LogSensor"

    const-string v1, "unBlockForAnalyze"

    :try_start_0
    invoke-static {v0, v1}, Lo/dhn;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    sget-object v0, Lo/dhn;->b:Lo/dia;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dia;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 126
    :goto_0
    return-void
.end method

.method private static d(Z[B)V
    .locals 2

    .line 95
    if-nez p0, :cond_0

    .line 96
    return-void

    .line 99
    :cond_0
    sget-object v0, Lo/dhn;->b:Lo/dia;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/dia;->e([BZ)V

    .line 100
    return-void
.end method
