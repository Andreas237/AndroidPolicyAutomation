.class public Lcom/huawei/hwid/core/d/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hwid/core/d/b/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v1, Lcom/huawei/hwid/core/d/b/e;

    monitor-enter v1

    .line 17
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/d;->b(Landroid/content/Context;)Lcom/huawei/hwid/core/d/b/d;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 31
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 32
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hwid/core/d/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 43
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 44
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hwid/core/d/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 55
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 56
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hwid/core/d/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 67
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 68
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hwid/core/d/b/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 79
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 80
    sget-object v0, Lcom/huawei/hwid/core/d/b/e;->a:Lcom/huawei/hwid/core/d/b/b;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hwid/core/d/b/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_0
    return-void
.end method
