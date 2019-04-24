.class Lo/clq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cma;

.field final synthetic b:Lcom/huawei/hihealth/HiDataDeleteOption;

.field final synthetic e:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V
    .locals 0

    .line 584
    iput-object p1, p0, Lo/clq$3;->e:Lo/clq;

    iput-object p2, p0, Lo/clq$3;->b:Lcom/huawei/hihealth/HiDataDeleteOption;

    iput-object p3, p0, Lo/clq$3;->a:Lo/cma;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 588
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 589
    iget-object v0, p0, Lo/clq$3;->e:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 591
    :try_start_0
    iget-object v0, p0, Lo/clq$3;->e:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$3;->b:Lcom/huawei/hihealth/HiDataDeleteOption;

    new-instance v2, Lo/clq$3$4;

    invoke-direct {v2, p0, v4, v5}, Lo/clq$3$4;-><init>(Lo/clq$3;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->e(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/clh;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 604
    goto :goto_0

    .line 600
    :catch_0
    move-exception v6

    .line 601
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    iget-object v0, p0, Lo/clq$3;->a:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 603
    iget-object v0, p0, Lo/clq$3;->a:Lo/cma;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete data fail"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/clq$3;->b:Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/cma;->onResult(ILjava/lang/Object;)V

    .line 605
    :cond_0
    :goto_0
    return-void
.end method
