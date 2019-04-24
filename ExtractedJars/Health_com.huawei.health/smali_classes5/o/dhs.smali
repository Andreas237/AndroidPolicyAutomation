.class public Lo/dhs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dhs;

.field private static final b:Ljava/lang/String;

.field private static c:Ljava/lang/Object;


# instance fields
.field private e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dhs;->c:Ljava/lang/Object;

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/dhu;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "app_config_value.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dhs;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dhs;->e:Ljava/util/concurrent/ExecutorService;

    .line 24
    return-void
.end method

.method public static b()Lo/dhs;
    .locals 4

    .line 26
    sget-object v2, Lo/dhs;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 27
    :try_start_0
    sget-object v0, Lo/dhs;->a:Lo/dhs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 28
    new-instance v0, Lo/dhs;

    invoke-direct {v0}, Lo/dhs;-><init>()V

    sput-object v0, Lo/dhs;->a:Lo/dhs;

    .line 30
    :cond_0
    sget-object v0, Lo/dhs;->a:Lo/dhs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 31
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 15
    sget-object v0, Lo/dhs;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 76
    new-instance v4, Ljava/io/File;

    sget-object v0, Lo/dhs;->b:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 79
    const-string v0, "Util_ConfigUserSetValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is delete file : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 35
    iget-object v0, p0, Lo/dhs;->e:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 36
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dhs;->e:Ljava/util/concurrent/ExecutorService;

    .line 38
    :cond_0
    iget-object v0, p0, Lo/dhs;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dhs$4;

    invoke-direct {v1, p0, p1, p2}, Lo/dhs$4;-><init>(Lo/dhs;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 70
    return-void
.end method
