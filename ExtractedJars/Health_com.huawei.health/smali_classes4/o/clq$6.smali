.class Lo/clq$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->e(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/HiDataUpdateOption;

.field final synthetic b:Lo/clq;

.field final synthetic e:Lo/cma;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V
    .locals 0

    .line 692
    iput-object p1, p0, Lo/clq$6;->b:Lo/clq;

    iput-object p2, p0, Lo/clq$6;->a:Lcom/huawei/hihealth/HiDataUpdateOption;

    iput-object p3, p0, Lo/clq$6;->e:Lo/cma;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 695
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 696
    iget-object v0, p0, Lo/clq$6;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 698
    :try_start_0
    iget-object v0, p0, Lo/clq$6;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$6;->a:Lcom/huawei/hihealth/HiDataUpdateOption;

    new-instance v2, Lo/clq$6$2;

    invoke-direct {v2, p0, v4, v5}, Lo/clq$6$2;-><init>(Lo/clq$6;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->d(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/clh;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 710
    goto :goto_0

    .line 706
    :catch_0
    move-exception v6

    .line 707
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 708
    iget-object v0, p0, Lo/clq$6;->e:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 709
    iget-object v0, p0, Lo/clq$6;->e:Lo/cma;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/cma;->onResult(ILjava/lang/Object;)V

    .line 711
    :cond_0
    :goto_0
    return-void
.end method