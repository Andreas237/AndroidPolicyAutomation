.class Lo/clq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cly;

.field final synthetic d:Lo/clq;

.field final synthetic e:Lcom/huawei/hihealth/HiAggregateOption;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V
    .locals 0

    .line 465
    iput-object p1, p0, Lo/clq$1;->d:Lo/clq;

    iput-object p2, p0, Lo/clq$1;->e:Lcom/huawei/hihealth/HiAggregateOption;

    iput-object p3, p0, Lo/clq$1;->c:Lo/cly;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 469
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 470
    iget-object v0, p0, Lo/clq$1;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 472
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 473
    iget-object v0, p0, Lo/clq$1;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$1;->e:Lcom/huawei/hihealth/HiAggregateOption;

    new-instance v2, Lo/clq$1$4;

    invoke-direct {v2, p0, v6, v4, v5}, Lo/clq$1$4;-><init>(Lo/clq$1;Ljava/util/List;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->c(Lcom/huawei/hihealth/HiAggregateOption;Lo/clb;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 494
    goto :goto_0

    .line 490
    :catch_0
    move-exception v6

    .line 491
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    iget-object v0, p0, Lo/clq$1;->c:Lo/cly;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 493
    iget-object v0, p0, Lo/clq$1;->c:Lo/cly;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cly;->onResult(Ljava/util/List;II)V

    .line 495
    :cond_0
    :goto_0
    return-void
.end method
