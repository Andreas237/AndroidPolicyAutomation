.class Lo/clq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cma;

.field final synthetic b:Lcom/huawei/hihealth/HiDataInsertOption;

.field final synthetic e:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V
    .locals 0

    .line 539
    iput-object p1, p0, Lo/clq$2;->e:Lo/clq;

    iput-object p2, p0, Lo/clq$2;->b:Lcom/huawei/hihealth/HiDataInsertOption;

    iput-object p3, p0, Lo/clq$2;->a:Lo/cma;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 543
    iget-object v0, p0, Lo/clq$2;->e:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 544
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 545
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 546
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 548
    :try_start_0
    iget-object v0, p0, Lo/clq$2;->b:Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-static {v0}, Lo/cnm;->b(Lcom/huawei/hihealth/HiDataInsertOption;)Ljava/util/List;

    move-result-object v8

    .line 549
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData options size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiDataInsertOption;

    .line 551
    new-instance v11, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v11, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 552
    iget-object v0, p0, Lo/clq$2;->e:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    new-instance v1, Lo/clq$2$3;

    invoke-direct {v1, p0, v6, v7, v11}, Lo/clq$2$3;-><init>(Lo/clq$2;[I[Ljava/lang/Object;Ljava/util/concurrent/CountDownLatch;)V

    invoke-interface {v0, v10, v1}, Lo/clg;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/clh;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 564
    :try_start_1
    invoke-virtual {v11}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 567
    goto :goto_1

    .line 565
    :catch_0
    move-exception v12

    .line 566
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: 2.0isLogin InterruptedException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 568
    :goto_1
    goto :goto_0

    .line 574
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget v2, v6, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",message = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget-object v2, v7, v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    iget-object v0, p0, Lo/clq$2;->a:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 576
    iget-object v0, p0, Lo/clq$2;->a:Lo/cma;

    const/4 v1, 0x0

    aget v1, v6, v1

    const/4 v2, 0x0

    aget-object v2, v7, v2

    invoke-interface {v0, v1, v2}, Lo/cma;->onResult(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 569
    :catch_1
    move-exception v8

    .line 570
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    const/4 v0, 0x1

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 572
    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 574
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget v2, v6, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",message = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget-object v2, v7, v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    iget-object v0, p0, Lo/clq$2;->a:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 576
    iget-object v0, p0, Lo/clq$2;->a:Lo/cma;

    const/4 v1, 0x0

    aget v1, v6, v1

    const/4 v2, 0x0

    aget-object v2, v7, v2

    invoke-interface {v0, v1, v2}, Lo/cma;->onResult(ILjava/lang/Object;)V

    goto :goto_2

    .line 574
    :catchall_0
    move-exception v13

    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget v2, v6, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",message = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget-object v2, v7, v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    iget-object v0, p0, Lo/clq$2;->a:Lo/cma;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 576
    iget-object v0, p0, Lo/clq$2;->a:Lo/cma;

    const/4 v1, 0x0

    aget v1, v6, v1

    const/4 v2, 0x0

    aget-object v2, v7, v2

    invoke-interface {v0, v1, v2}, Lo/cma;->onResult(ILjava/lang/Object;)V

    .line 577
    :cond_1
    throw v13

    .line 578
    :cond_2
    :goto_2
    return-void

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method
