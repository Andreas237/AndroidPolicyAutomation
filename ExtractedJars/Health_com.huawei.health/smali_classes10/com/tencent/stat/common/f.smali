.class public Lcom/tencent/stat/common/f;
.super Ljava/lang/Object;


# static fields
.field static a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/tencent/stat/common/f;->a:J

    return-void
.end method

.method static a(Landroid/content/Context;Ljava/lang/String;)J
    .locals 2

    sget-wide v0, Lcom/tencent/stat/common/f;->a:J

    invoke-static {p0, p1, v0, v1}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method static a(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/tencent/stat/common/p;->b(Landroid/content/Context;Ljava/lang/String;J)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Z
    .locals 8

    const-class v7, Lcom/tencent/stat/common/f;

    monitor-enter v7

    const-string v0, "1.6.2_begin_protection"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v3

    const-string v0, "1.6.2_end__protection"

    invoke-static {p0, v0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_0

    sget-wide v0, Lcom/tencent/stat/common/f;->a:J

    cmp-long v0, v5, v0

    if-nez v0, :cond_0

    monitor-exit v7

    const/4 v0, 0x0

    return v0

    :cond_0
    sget-wide v0, Lcom/tencent/stat/common/f;->a:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_1

    const-string v0, "1.6.2_begin_protection"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {p0, v0, v1, v2}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v7

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)V
    .locals 6

    const-class v5, Lcom/tencent/stat/common/f;

    monitor-enter v5

    const-string v0, "1.6.2_end__protection"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v3

    sget-wide v0, Lcom/tencent/stat/common/f;->a:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_0

    const-string v0, "1.6.2_end__protection"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {p0, v0, v1, v2}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v5

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method
