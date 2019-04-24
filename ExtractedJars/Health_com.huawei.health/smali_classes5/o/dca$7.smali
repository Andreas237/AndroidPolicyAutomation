.class Lo/dca$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dca;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dca;


# direct methods
.method constructor <init>(Lo/dca;)V
    .locals 0

    .line 1239
    iput-object p1, p0, Lo/dca$7;->e:Lo/dca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 1242
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSyncCoreSleep_2 core sleep sync has been done err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1244
    const/16 v0, 0x4e20

    if-ne v0, p1, :cond_0

    .line 1246
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1247
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/16 v1, 0x4e20

    invoke-interface {v0, v1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 1249
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 1250
    iget-object v0, p0, Lo/dca$7;->e:Lo/dca;

    const-string v1, ""

    invoke-static {v0, p1, v1}, Lo/dca;->e(Lo/dca;ILjava/lang/String;)V

    goto :goto_0

    .line 1253
    :cond_1
    iget-object v0, p0, Lo/dca$7;->e:Lo/dca;

    invoke-static {v0}, Lo/dca;->d(Lo/dca;)Lo/dca$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1254
    iget-object v0, p0, Lo/dca$7;->e:Lo/dca;

    invoke-static {v0}, Lo/dca;->d(Lo/dca;)Lo/dca$c;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/dca$c;->sendEmptyMessage(I)Z

    .line 1257
    :cond_2
    :goto_0
    return-void
.end method
