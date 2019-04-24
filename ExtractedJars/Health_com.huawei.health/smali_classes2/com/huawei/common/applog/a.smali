.class public final Lcom/huawei/common/applog/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/common/applog/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "AppLogManager"

.field private static final b:I = 0x3c

.field private static c:Lcom/huawei/common/applog/a; = null

.field private static final k:Ljava/lang/Object;


# instance fields
.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z

.field private h:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Lcom/huawei/common/applog/bean/a;>;"
        }
    .end annotation
.end field

.field private i:Lcom/huawei/common/applog/a$a;

.field private j:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lcom/huawei/common/applog/a;

    invoke-direct {v0}, Lcom/huawei/common/applog/a;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/a;->c:Lcom/huawei/common/applog/a;

    .line 69
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/a;->k:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/common/applog/a;->e:I

    .line 54
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/common/applog/a;->f:I

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->g:Z

    .line 61
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/common/applog/a;->h:Ljava/util/concurrent/BlockingQueue;

    .line 66
    new-instance v0, Lcom/huawei/common/applog/a$a;

    invoke-direct {v0, p0}, Lcom/huawei/common/applog/a$a;-><init>(Lcom/huawei/common/applog/a;)V

    iput-object v0, p0, Lcom/huawei/common/applog/a;->i:Lcom/huawei/common/applog/a$a;

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->l:Z

    .line 76
    const-string v0, "AppLogManager"

    const-string v1, "AppLogManager onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    return-void
.end method

.method static synthetic a(Lcom/huawei/common/applog/a;)I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/common/applog/a;->e:I

    return v0
.end method

.method public static a()Lcom/huawei/common/applog/a;
    .locals 1

    .line 86
    sget-object v0, Lcom/huawei/common/applog/a;->c:Lcom/huawei/common/applog/a;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/common/applog/a;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/huawei/common/applog/a;->j:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/common/applog/a;)Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/common/applog/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/common/applog/a;)I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/common/applog/a;->f:I

    return v0
.end method

.method static synthetic c()Ljava/lang/Object;
    .locals 1

    .line 30
    sget-object v0, Lcom/huawei/common/applog/a;->k:Ljava/lang/Object;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 139
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    if-nez v0, :cond_0

    .line 140
    const-string v0, "AppLogManager"

    const-string v1, "worker start"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    .line 142
    iget-object v0, p0, Lcom/huawei/common/applog/a;->i:Lcom/huawei/common/applog/a$a;

    invoke-virtual {v0}, Lcom/huawei/common/applog/a$a;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 151
    :cond_0
    goto :goto_0

    .line 145
    :catch_0
    move-exception v2

    .line 146
    const-string v0, "AppLogManager"

    const-string v1, "worker IllegalThreadStateException"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    .line 151
    goto :goto_0

    .line 148
    :catch_1
    move-exception v2

    .line 149
    const-string v0, "AppLogManager"

    const-string v1, "worker IllegalThreadStateException"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    .line 153
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/common/applog/a;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/common/applog/a;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/huawei/common/applog/a;->g:Z

    return v0
.end method

.method static synthetic f(Lcom/huawei/common/applog/a;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/common/applog/a;->h:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;ILjava/lang/String;IZ)V
    .locals 4

    .line 106
    sget-object v2, Lcom/huawei/common/applog/a;->k:Ljava/lang/Object;

    monitor-enter v2

    .line 108
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/common/applog/a;->l:Z

    if-nez v0, :cond_3

    .line 109
    const-string v0, "AppLogManager"

    const-string v1, "first init"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->l:Z

    .line 112
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 114
    :cond_0
    monitor-exit v2

    return-void

    .line 116
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "feedbacklogs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/common/applog/a;->d:Ljava/lang/String;

    goto :goto_0

    .line 119
    :cond_2
    iput-object p3, p0, Lcom/huawei/common/applog/a;->d:Ljava/lang/String;

    .line 122
    :goto_0
    iput p2, p0, Lcom/huawei/common/applog/a;->e:I

    .line 123
    iput p4, p0, Lcom/huawei/common/applog/a;->f:I

    .line 124
    iput-boolean p5, p0, Lcom/huawei/common/applog/a;->g:Z

    .line 125
    invoke-direct {p0}, Lcom/huawei/common/applog/a;->d()V

    goto :goto_1

    .line 128
    :cond_3
    const-string v0, "AppLogManager"

    const-string v1, "already init"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :goto_1
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 131
    :goto_2
    return-void
.end method

.method public a(Lcom/huawei/common/applog/bean/a;)Z
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/common/applog/a;->h:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 4

    .line 159
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/a;->j:Z

    .line 160
    new-instance v0, Lcom/huawei/common/applog/bean/a;

    const-string v1, "I"

    const-string v2, "AppLogManager"

    const-string v3, "printWorker is stop"

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/common/applog/bean/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/common/applog/a;->a(Lcom/huawei/common/applog/bean/a;)Z

    .line 161
    return-void
.end method
