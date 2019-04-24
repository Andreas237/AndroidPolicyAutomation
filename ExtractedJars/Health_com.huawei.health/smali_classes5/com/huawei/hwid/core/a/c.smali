.class public Lcom/huawei/hwid/core/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:I

.field private static volatile c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hwid/core/a/c;->a:Z

    .line 29
    const/4 v0, 0x0

    sput v0, Lcom/huawei/hwid/core/a/c;->b:I

    .line 36
    const/4 v0, 0x0

    sput v0, Lcom/huawei/hwid/core/a/c;->c:I

    return-void
.end method

.method public static declared-synchronized a(I)V
    .locals 1

    const-class v0, Lcom/huawei/hwid/core/a/c;

    monitor-enter v0

    .line 94
    :try_start_0
    sput p0, Lcom/huawei/hwid/core/a/c;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v1, Lcom/huawei/hwid/core/a/c;

    monitor-enter v1

    .line 87
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/a/a;->c()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    invoke-static {p0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/a/a;->d()V

    .line 89
    invoke-static {p0}, Lcom/huawei/hwid/core/a/c;->b(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static declared-synchronized a(Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 2

    const-class v1, Lcom/huawei/hwid/core/a/c;

    monitor-enter v1

    .line 97
    if-eqz p0, :cond_0

    .line 98
    :try_start_0
    new-instance v0, Lcom/huawei/hwid/core/a/b;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwid/core/a/b;-><init>(Landroid/os/Bundle;Landroid/content/Context;)V

    .line 99
    invoke-static {v0, p1}, Lcom/huawei/hwid/core/a/c;->a(Lcom/huawei/hwid/core/a/b;Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static declared-synchronized a(Lcom/huawei/hwid/core/a/b;Landroid/content/Context;)V
    .locals 3

    const-class v2, Lcom/huawei/hwid/core/a/c;

    monitor-enter v2

    .line 45
    const-string v0, "OpLogUtil"

    const-string v1, "recordOpLog"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 47
    :cond_0
    monitor-exit v2

    return-void

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hwid/core/a/b;->a()I

    move-result v0

    sput v0, Lcom/huawei/hwid/core/a/c;->b:I

    .line 50
    sget v0, Lcom/huawei/hwid/core/a/c;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 52
    invoke-static {p1}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwid/core/a/a;->a(Lcom/huawei/hwid/core/a/b;)V

    .line 53
    invoke-static {p1}, Lcom/huawei/hwid/core/a/c;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 54
    :cond_2
    sget v0, Lcom/huawei/hwid/core/a/c;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 56
    invoke-static {p1}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwid/core/a/a;->b(Lcom/huawei/hwid/core/a/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    :cond_3
    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method private static declared-synchronized b(Landroid/content/Context;)V
    .locals 4

    const-class v3, Lcom/huawei/hwid/core/a/c;

    monitor-enter v3

    .line 66
    :try_start_0
    sget-boolean v0, Lcom/huawei/hwid/core/a/c;->a:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    invoke-static {p0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/a/a;->b()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    new-instance v2, Lcom/huawei/hwid/core/b/a/a/b;

    invoke-static {p0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/hwid/core/b/a/a/b;-><init>(Ljava/lang/String;)V

    .line 71
    sget v0, Lcom/huawei/hwid/core/a/c;->b:I

    if-lez v0, :cond_0

    sget v0, Lcom/huawei/hwid/core/a/c;->b:I

    const/16 v1, 0x3e7

    if-gt v0, v1, :cond_0

    .line 72
    sget v0, Lcom/huawei/hwid/core/a/c;->b:I

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/b/a/a/b;->c(I)V

    .line 74
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, p0, v2, v0, v1}, Lcom/huawei/hwid/core/b/a/a/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 75
    const/4 v0, 0x1

    sput v0, Lcom/huawei/hwid/core/a/c;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    :cond_1
    monitor-exit v3

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method
