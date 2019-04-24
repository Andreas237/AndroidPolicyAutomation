.class Lo/cvz$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->g(Landroid/content/Context;JJLo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cvz;

.field final synthetic d:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 1552
    iput-object p1, p0, Lo/cvz$8;->a:Lo/cvz;

    iput-object p2, p0, Lo/cvz$8;->d:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 9

    .line 1555
    iget-object v0, p0, Lo/cvz$8;->d:Lo/duh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1556
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1557
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1558
    iget-object v0, p0, Lo/cvz$8;->d:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1559
    return-void

    .line 1562
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 1563
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1564
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1565
    iget-object v0, p0, Lo/cvz$8;->d:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1566
    return-void

    .line 1568
    :cond_1
    const/16 v0, 0x7533

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 1569
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 1570
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1571
    :cond_2
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1572
    iget-object v0, p0, Lo/cvz$8;->d:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1573
    return-void

    .line 1575
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 1576
    if-nez v7, :cond_4

    .line 1577
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiHealthData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1578
    iget-object v0, p0, Lo/cvz$8;->d:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1579
    return-void

    .line 1582
    :cond_4
    new-instance v8, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v8}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    .line 1583
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackDetail success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1584
    invoke-static {v7, v8}, Lo/dhh;->e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Ljava/lang/String;

    .line 1585
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveDeviceType(I)V

    .line 1587
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1588
    iget-object v0, p0, Lo/cvz$8;->d:Lo/duh;

    invoke-interface {v0, p2, v8}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1589
    goto :goto_0

    .line 1590
    :cond_5
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "achieveCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1592
    :goto_0
    return-void
.end method
