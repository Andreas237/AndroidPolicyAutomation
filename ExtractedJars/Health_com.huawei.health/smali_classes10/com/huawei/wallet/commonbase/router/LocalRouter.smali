.class public Lcom/huawei/wallet/commonbase/router/LocalRouter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;
    }
.end annotation


# static fields
.field private static final a:[B

.field private static volatile d:Lcom/huawei/wallet/commonbase/router/LocalRouter;


# instance fields
.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/wallet/commonbase/router/WalletProvider;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->a:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->c:Ljava/util/Map;

    .line 29
    return-void
.end method

.method private a(Lcom/huawei/wallet/commonbase/router/RouterRequest;)Lcom/huawei/wallet/commonbase/router/WalletAction;
    .locals 7

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b(Lcom/huawei/wallet/commonbase/router/RouterRequest;)Ljava/lang/String;

    move-result-object v3

    .line 99
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->c:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/wallet/commonbase/router/WalletProvider;

    .line 100
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/wallet/commonbase/router/WalletProvider;

    .line 101
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Provider not found, provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 104
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_0
    const/4 v6, 0x0

    .line 108
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 110
    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/wallet/commonbase/router/WalletProvider;->e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/WalletAction;

    move-result-object v6

    .line 112
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 114
    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/wallet/commonbase/router/WalletProvider;->e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/WalletAction;

    move-result-object v6

    .line 116
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Action not found,action"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 121
    :cond_3
    return-object v6
.end method

.method public static b()Lcom/huawei/wallet/commonbase/router/LocalRouter;
    .locals 3

    .line 33
    sget-object v0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->d:Lcom/huawei/wallet/commonbase/router/LocalRouter;

    if-nez v0, :cond_1

    .line 34
    sget-object v1, Lcom/huawei/wallet/commonbase/router/LocalRouter;->a:[B

    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->d:Lcom/huawei/wallet/commonbase/router/LocalRouter;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/huawei/wallet/commonbase/router/LocalRouter;

    invoke-direct {v0}, Lcom/huawei/wallet/commonbase/router/LocalRouter;-><init>()V

    sput-object v0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->d:Lcom/huawei/wallet/commonbase/router/LocalRouter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 40
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->d:Lcom/huawei/wallet/commonbase/router/LocalRouter;

    return-object v0
.end method

.method private b(Lcom/huawei/wallet/commonbase/router/RouterRequest;)Ljava/lang/String;
    .locals 1

    .line 92
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/wallet/commonbase/router/WalletProvider;)V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/WalletProvider;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    return-void
.end method

.method public e(Lcom/huawei/wallet/commonbase/router/RouterRequest;Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;)Lcom/huawei/wallet/commonbase/router/RouterResponse;
    .locals 11

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invoke action : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 54
    const/4 v6, 0x0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->a(Lcom/huawei/wallet/commonbase/router/RouterRequest;)Lcom/huawei/wallet/commonbase/router/WalletAction;

    move-result-object v7

    .line 57
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Action not found,action:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 61
    new-instance v6, Lcom/huawei/wallet/commonbase/router/RouterResponse;

    const-string v0, "99998"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Action not found,action:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterResponse;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    return-object v6

    .line 66
    :cond_0
    new-instance v6, Lcom/huawei/wallet/commonbase/router/RouterResponse;

    invoke-direct {v6}, Lcom/huawei/wallet/commonbase/router/RouterResponse;-><init>()V

    .line 68
    new-instance v8, Lcom/huawei/wallet/commonbase/router/WalletActionRequest;

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v8, v0, v1}, Lcom/huawei/wallet/commonbase/router/WalletActionRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 71
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->d()Landroid/content/Context;

    move-result-object v0

    invoke-interface {v7, v0, v8}, Lcom/huawei/wallet/commonbase/router/WalletAction;->e(Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 73
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sync invoke action:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 75
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->a(Z)V

    .line 76
    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->d()Landroid/content/Context;

    move-result-object v0

    invoke-interface {v7, v0, v8}, Lcom/huawei/wallet/commonbase/router/WalletAction;->c(Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;)Lcom/huawei/wallet/commonbase/router/WalletActionResult;

    move-result-object v9

    .line 77
    invoke-virtual {v9}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v6, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->e(Z)V

    .line 78
    invoke-virtual {v9}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->e()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->a(Ljava/util/Map;)V

    .line 79
    goto :goto_1

    .line 82
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASync invoke action:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 83
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->a(Z)V

    .line 84
    new-instance v0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;

    move-object v1, p2

    move-object v2, v6

    move-object v3, v8

    invoke-virtual {p1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->d()Landroid/content/Context;

    move-result-object v4

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;-><init>(Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;Lcom/huawei/wallet/commonbase/router/RouterResponse;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletAction;)V

    move-object v9, v0

    .line 85
    invoke-static {}, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->c()Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v10

    .line 87
    :goto_1
    return-object v6
.end method
