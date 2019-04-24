.class Lo/vd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/vd;


# direct methods
.method constructor <init>(Lo/vd;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/vd$1;->d:Lo/vd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 113
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 116
    const/4 v4, 0x0

    .line 117
    :try_start_0
    invoke-static {p2}, Lo/vf$d;->a(Landroid/os/IBinder;)Lo/vf;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-interface {v0, v1}, Lo/vf;->b(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v4

    .line 118
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 119
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v4}, Lo/vh$b;->a(Landroid/os/IBinder;)Lo/vh;

    move-result-object v1

    invoke-static {v0, v1}, Lo/vd;->e(Lo/vd;Lo/vh;)Lo/vh;

    .line 120
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->c(Lo/vd;)Lo/vh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 121
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 122
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountAidlInterface not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "onServiceConnected"

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 126
    :cond_0
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountAidlInterface null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "onServiceConnected"

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 130
    :cond_1
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 131
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountAidlInterface null 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "onServiceConnected"

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 135
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/vd;->a(Lo/vd;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 136
    goto :goto_1

    .line 137
    :cond_3
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 138
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountAidlInterface null 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "onServiceConnected"

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/vd;->a(Lo/vd;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    :cond_4
    :goto_1
    goto :goto_2

    .line 143
    :catch_0
    move-exception v4

    .line 144
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :goto_2
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 153
    invoke-static {}, Lo/vd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    invoke-static {v0}, Lo/vd;->b(Lo/vd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "onServiceConnected"

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lo/vd$1;->d:Lo/vd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/vd;->a(Lo/vd;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 159
    :cond_0
    return-void
.end method
