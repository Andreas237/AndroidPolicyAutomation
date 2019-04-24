.class public Lo/cvx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ecx;


# static fields
.field private static a:Lo/cvx;

.field private static d:Lo/div;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v0

    sput-object v0, Lo/cvx;->d:Lo/div;

    .line 25
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 26
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    return-void

    .line 29
    :cond_0
    return-void
.end method

.method public static b()Lo/cvx;
    .locals 6

    .line 33
    const-class v4, Lo/cvx;

    monitor-enter v4

    .line 34
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "instance: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/cvx;->a:Lo/cvx;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    sget-object v0, Lo/cvx;->a:Lo/cvx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 36
    new-instance v0, Lo/cvx;

    invoke-direct {v0}, Lo/cvx;-><init>()V

    sput-object v0, Lo/cvx;->a:Lo/cvx;

    .line 38
    :cond_0
    sget-object v0, Lo/cvx;->a:Lo/cvx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 39
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 83
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 84
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0}, Lo/div;->l()I

    move-result v0

    return v0

    .line 87
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "blueToothConnectStatus mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 126
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1}, Lo/div;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 127
    return-void
.end method

.method public b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 94
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 95
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/div;->d(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 98
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendConformCode mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 44
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 45
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1, p2, p3}, Lo/div;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 48
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openEsim mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    :goto_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 5

    .line 114
    const-string v4, ""

    .line 115
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 116
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0}, Lo/div;->p()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 119
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEsimPermission mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :goto_0
    return-object v4
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 73
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1}, Lo/div;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 77
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegiserBTConnectChangerCallBack mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 53
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 54
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1, p2, p3}, Lo/div;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 57
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openEsim mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 105
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 106
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1}, Lo/div;->c(Z)V

    goto :goto_0

    .line 109
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAppAuthStatus mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 3

    .line 131
    const/4 v2, 0x0

    .line 132
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 133
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0}, Lo/div;->k()Z

    move-result v2

    .line 136
    :cond_0
    return v2
.end method

.method public e()Ljava/lang/String;
    .locals 3

    .line 140
    const-string v2, ""

    .line 141
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 142
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0}, Lo/div;->d()Ljava/lang/String;

    move-result-object v2

    .line 145
    :cond_0
    return-object v2
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 63
    sget-object v0, Lo/cvx;->d:Lo/div;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    sget-object v0, Lo/cvx;->d:Lo/div;

    invoke-virtual {v0, p1}, Lo/div;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 67
    :cond_0
    const-string v0, "PluginSimAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regiserBTConnectChangerCallBack mMultiSimMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    :goto_0
    return-void
.end method
