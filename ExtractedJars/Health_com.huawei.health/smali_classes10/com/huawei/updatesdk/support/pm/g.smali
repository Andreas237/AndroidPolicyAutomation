.class public Lcom/huawei/updatesdk/support/pm/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/support/pm/g$a;
    }
.end annotation


# static fields
.field protected static final a:Lcom/huawei/updatesdk/support/pm/d;

.field private static final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/support/pm/g;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lcom/huawei/updatesdk/support/pm/d;

    invoke-direct {v0}, Lcom/huawei/updatesdk/support/pm/d;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/support/pm/g;->a:Lcom/huawei/updatesdk/support/pm/d;

    return-void
.end method

.method static synthetic a(Ljava/lang/String;)Lcom/huawei/updatesdk/support/pm/b;
    .locals 1

    invoke-static {p0}, Lcom/huawei/updatesdk/support/pm/g;->b(Ljava/lang/String;)Lcom/huawei/updatesdk/support/pm/b;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Lcom/huawei/updatesdk/support/pm/d$a;)Lcom/huawei/updatesdk/support/pm/b;
    .locals 2

    sget-object v0, Lcom/huawei/updatesdk/support/pm/g;->a:Lcom/huawei/updatesdk/support/pm/d;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/updatesdk/support/pm/d;->a(Ljava/lang/String;Lcom/huawei/updatesdk/support/pm/d$a;)Lcom/huawei/updatesdk/support/pm/b;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected static a(II)V
    .locals 4

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "INSTALL_STATE"

    invoke-virtual {v2, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "INSTALL_TYPE"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/service/secure/a;->a(Landroid/content/Intent;)Lcom/huawei/updatesdk/sdk/service/secure/a;

    move-result-object v3

    invoke-static {}, Lcom/huawei/updatesdk/support/d/c;->a()Lcom/huawei/updatesdk/support/d/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/updatesdk/support/d/c;->c(Lcom/huawei/updatesdk/sdk/service/secure/a;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/huawei/updatesdk/support/pm/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static b(Ljava/lang/String;)Lcom/huawei/updatesdk/support/pm/b;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/support/pm/d$a;->a:Lcom/huawei/updatesdk/support/pm/d$a;

    invoke-static {p0, v0}, Lcom/huawei/updatesdk/support/pm/g;->a(Ljava/lang/String;Lcom/huawei/updatesdk/support/pm/d$a;)Lcom/huawei/updatesdk/support/pm/b;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-class v6, Lcom/huawei/updatesdk/support/pm/g;

    monitor-enter v6

    const-string v0, "PackageService"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "process:processType=install,path="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isNow="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PackageService"

    const-string v1, "install failed!!!path is empty!!!!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v6

    return-void

    :cond_0
    new-instance v3, Lcom/huawei/updatesdk/support/pm/b;

    invoke-direct {v3, p1, p0, p2}, Lcom/huawei/updatesdk/support/pm/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$a;->b:Lcom/huawei/updatesdk/support/pm/c$a;

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/support/pm/b;->a(Lcom/huawei/updatesdk/support/pm/c$a;)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/support/pm/b;->a(Z)V

    invoke-virtual {v3}, Lcom/huawei/updatesdk/support/pm/b;->d()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const-string v0, "PackageService"

    const-string v1, "task.param is null!!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    sget-object v0, Lcom/huawei/updatesdk/support/pm/g;->a:Lcom/huawei/updatesdk/support/pm/d;

    invoke-virtual {v0, p1, v3}, Lcom/huawei/updatesdk/support/pm/d;->a(Ljava/lang/String;Lcom/huawei/updatesdk/support/pm/b;)Lcom/huawei/updatesdk/support/pm/b;

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$b;->a:Lcom/huawei/updatesdk/support/pm/c$b;

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/support/pm/b;->a(Lcom/huawei/updatesdk/support/pm/c$b;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "install|pkg:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/updatesdk/support/pm/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|path:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/Thread;

    new-instance v0, Lcom/huawei/updatesdk/support/pm/e;

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/huawei/updatesdk/support/pm/e;-><init>(Landroid/content/Context;Lcom/huawei/updatesdk/support/pm/b;)V

    invoke-direct {v5, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v5, v4}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method
