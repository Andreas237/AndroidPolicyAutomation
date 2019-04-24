.class Lo/cvz$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->e(Landroid/content/Context;JJLo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/cvz;

.field final synthetic e:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;Landroid/content/Context;J)V
    .locals 0

    .line 1496
    iput-object p1, p0, Lo/cvz$10;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$10;->e:Lo/duh;

    iput-object p3, p0, Lo/cvz$10;->c:Landroid/content/Context;

    iput-wide p4, p0, Lo/cvz$10;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 13

    .line 1500
    iget-object v0, p0, Lo/cvz$10;->e:Lo/duh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1501
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1502
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1503
    iget-object v0, p0, Lo/cvz$10;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1504
    return-void

    .line 1507
    :cond_0
    move-object v7, p1

    check-cast v7, Landroid/util/SparseArray;

    .line 1508
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1509
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1510
    iget-object v0, p0, Lo/cvz$10;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1511
    return-void

    .line 1513
    :cond_1
    const/16 v0, 0x7532

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1514
    move-object v9, v8

    check-cast v9, Ljava/util/List;

    .line 1515
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1516
    :cond_2
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    iget-object v0, p0, Lo/cvz$10;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1518
    return-void

    .line 1520
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 1521
    if-nez v10, :cond_4

    .line 1522
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiHealthData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1523
    iget-object v0, p0, Lo/cvz$10;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1524
    return-void

    .line 1526
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v11

    .line 1527
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hiHealthData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "endTime is"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1528
    iget-object v0, p0, Lo/cvz$10;->d:Lo/cvz;

    iget-object v1, p0, Lo/cvz$10;->c:Landroid/content/Context;

    iget-wide v2, p0, Lo/cvz$10;->a:J

    move-wide v4, v11

    iget-object v6, p0, Lo/cvz$10;->e:Lo/duh;

    invoke-virtual/range {v0 .. v6}, Lo/cvz;->g(Landroid/content/Context;JJLo/duh;)V

    .line 1529
    goto :goto_0

    .line 1530
    :cond_5
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "achieveCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1532
    :goto_0
    return-void
.end method
