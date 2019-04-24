.class Lo/agk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/agk;


# direct methods
.method constructor <init>(Lo/agk;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/agk$3;->c:Lo/agk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 263
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataHandler type is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lo/agk$3;->c:Lo/agk;

    invoke-static {v0}, Lo/agk;->e(Lo/agk;)Lo/abz;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 265
    if-nez p1, :cond_0

    .line 266
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget-object v0, p0, Lo/agk$3;->c:Lo/agk;

    invoke-static {v0}, Lo/agk;->e(Lo/agk;)Lo/abz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/abz;->a(Z)V

    goto :goto_0

    .line 269
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    iget-object v0, p0, Lo/agk$3;->c:Lo/agk;

    invoke-static {v0}, Lo/agk;->e(Lo/agk;)Lo/abz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/abz;->a(Z)V

    .line 273
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/agk$3;->c:Lo/agk;

    invoke-static {v0}, Lo/agk;->c(Lo/agk;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 274
    iget-object v0, p0, Lo/agk$3;->c:Lo/agk;

    invoke-static {v0}, Lo/agk;->c(Lo/agk;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 276
    :cond_2
    return-void
.end method
