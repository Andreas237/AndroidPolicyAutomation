.class Lo/cnq$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->b(ILjava/util/List;Lo/cla;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lo/cla;

.field final synthetic d:Lo/crd;

.field final synthetic e:Ljava/util/List;

.field final synthetic f:J

.field final synthetic k:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Ljava/util/List;ILjava/util/ArrayList;Lo/cla;Lo/crd;J)V
    .locals 0

    .line 1434
    iput-object p1, p0, Lo/cnq$6;->k:Lo/cnq;

    iput-object p2, p0, Lo/cnq$6;->e:Ljava/util/List;

    iput p3, p0, Lo/cnq$6;->a:I

    iput-object p4, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    iput-object p5, p0, Lo/cnq$6;->c:Lo/cla;

    iput-object p6, p0, Lo/cnq$6;->d:Lo/crd;

    iput-wide p7, p0, Lo/cnq$6;->f:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1437
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo goalInfos = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$6;->e:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "userId = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/cnq$6;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1439
    iget-object v0, p0, Lo/cnq$6;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cnq$6;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1440
    :cond_0
    iget-object v0, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    iget-object v0, p0, Lo/cnq$6;->c:Lo/cla;

    iget-object v1, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    const/4 v2, 0x7

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1442
    return-void

    .line 1444
    :cond_1
    const/4 v6, 0x0

    .line 1445
    iget-object v0, p0, Lo/cnq$6;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    .line 1447
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_3

    .line 1448
    iget-object v0, p0, Lo/cnq$6;->e:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiGoalInfo;

    .line 1449
    iget-object v0, p0, Lo/cnq$6;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v0

    iget v1, p0, Lo/cnq$6;->a:I

    iget-object v2, p0, Lo/cnq$6;->d:Lo/crd;

    invoke-virtual {v2}, Lo/crd;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2, v10}, Lo/cnv;->c(IILcom/huawei/hihealth/HiGoalInfo;)Z

    move-result v8

    .line 1450
    if-eqz v8, :cond_2

    .line 1451
    const/4 v6, 0x1

    .line 1453
    :cond_2
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1447
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1455
    :cond_3
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo flag = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1457
    if-eqz v6, :cond_4

    .line 1458
    iget-object v0, p0, Lo/cnq$6;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 1459
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "setGoalInfo"

    iget-object v2, p0, Lo/cnq$6;->d:Lo/crd;

    .line 1460
    const/16 v3, 0x65

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 1461
    iget-object v0, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1462
    iget-object v0, p0, Lo/cnq$6;->c:Lo/cla;

    iget-object v1, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    goto :goto_1

    .line 1464
    :cond_4
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1465
    iget-object v0, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1466
    iget-object v0, p0, Lo/cnq$6;->c:Lo/cla;

    iget-object v1, p0, Lo/cnq$6;->b:Ljava/util/ArrayList;

    const/16 v2, 0x10

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1468
    :goto_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo() end! totalTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/cnq$6;->f:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    return-void
.end method
