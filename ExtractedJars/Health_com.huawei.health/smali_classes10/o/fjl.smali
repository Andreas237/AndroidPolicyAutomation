.class public Lo/fjl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/fjl;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:Lo/czn;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lo/fjl;->d:Lo/fjl;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fjl;->c:Lo/czn;

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/fjl;->e:Landroid/content/Context;

    .line 49
    iget-object v0, p0, Lo/fjl;->c:Lo/czn;

    if-nez v0, :cond_0

    .line 51
    invoke-static {p1}, Lo/czn;->e(Landroid/content/Context;)Lo/czn;

    move-result-object v0

    iput-object v0, p0, Lo/fjl;->c:Lo/czn;

    .line 53
    :cond_0
    iget-object v0, p0, Lo/fjl;->b:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 54
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fjl;->b:Ljava/util/concurrent/ExecutorService;

    .line 56
    :cond_1
    return-void
.end method

.method static synthetic b(Lo/fjl;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/fjl;->e:Landroid/content/Context;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Lo/fjl;
    .locals 3

    .line 38
    sget-object v0, Lo/fjl;->d:Lo/fjl;

    if-nez v0, :cond_1

    .line 39
    const-class v1, Lo/fjl;

    monitor-enter v1

    .line 40
    :try_start_0
    sget-object v0, Lo/fjl;->d:Lo/fjl;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lo/fjl;

    invoke-direct {v0, p0}, Lo/fjl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fjl;->d:Lo/fjl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 45
    :cond_1
    :goto_0
    sget-object v0, Lo/fjl;->d:Lo/fjl;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 95
    const-string v0, "MarketCommentMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MarketCommentCloud_upload_enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const-string v0, "MarketCommentMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadCommentStatus is oversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 100
    :cond_0
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateCommentReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateCommentReq;-><init>()V

    .line 101
    iget-object v0, p0, Lo/fjl;->c:Lo/czn;

    new-instance v1, Lo/fjl$2;

    invoke-direct {v1, p0}, Lo/fjl$2;-><init>(Lo/fjl;)V

    invoke-virtual {v0, v4, v1}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateCommentReq;Lo/cyx;)V

    .line 113
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 114
    iget-object v0, p0, Lo/fjl;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lo/fjl;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/fjl$3;

    invoke-direct {v1, p0, v5}, Lo/fjl$3;-><init>(Lo/fjl;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 133
    :cond_1
    return-void
.end method

.method public d()V
    .locals 5

    .line 59
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    const-string v0, "MarketCommentMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadCommentStatus is oversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    return-void

    .line 63
    :cond_0
    const-string v0, "MarketCommentMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MarketCommentCloud_download_enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentReq;-><init>()V

    .line 66
    iget-object v0, p0, Lo/fjl;->c:Lo/czn;

    new-instance v1, Lo/fjl$4;

    invoke-direct {v1, p0}, Lo/fjl$4;-><init>(Lo/fjl;)V

    invoke-virtual {v0, v4, v1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentReq;Lo/cyx;)V

    .line 78
    iget-object v0, p0, Lo/fjl;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Lo/fjl;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/fjl$5;

    invoke-direct {v1, p0}, Lo/fjl$5;-><init>(Lo/fjl;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 92
    :cond_1
    return-void
.end method
