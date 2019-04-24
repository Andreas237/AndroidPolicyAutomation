.class Lo/dlf$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lo/dlf$11;->d:Lo/dlf;

    iput-object p2, p0, Lo/dlf$11;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 212
    const v5, 0x186a1

    .line 214
    :try_start_0
    iget-object v0, p0, Lo/dlf$11;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->e()V

    .line 215
    iget-object v0, p0, Lo/dlf$11;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->c(Lo/dlf;)Lo/dlu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlu;->e()V

    .line 216
    invoke-static {}, Lo/dlx;->c()Lo/dlx;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlx;->e()V

    .line 217
    iget-object v0, p0, Lo/dlf$11;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->a(Lo/dlf;)Lo/dlp;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlp;->e()V

    .line 218
    iget-object v0, p0, Lo/dlf$11;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->e(Lo/dlf;)Lo/dlw;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlw;->e()V

    .line 219
    iget-object v0, p0, Lo/dlf$11;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->g(Lo/dlf;)Lo/dlt;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlt;->e()V

    .line 220
    iget-object v0, p0, Lo/dlf$11;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e29

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_timercheck_time"

    .line 222
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 220
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    const/4 v5, 0x0

    .line 226
    goto :goto_0

    .line 224
    :catch_0
    move-exception v6

    .line 225
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTimerCheck error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :goto_0
    iget-object v0, p0, Lo/dlf$11;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 228
    return-void
.end method
