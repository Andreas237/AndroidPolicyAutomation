.class Lo/cvz$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->e(Landroid/content/Context;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cvz;

.field e:Lo/dgu$e;


# direct methods
.method constructor <init>(Lo/cvz;)V
    .locals 1

    .line 1612
    iput-object p1, p0, Lo/cvz$6;->b:Lo/cvz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1613
    new-instance v0, Lo/dgu$e;

    invoke-direct {v0}, Lo/dgu$e;-><init>()V

    iput-object v0, p0, Lo/cvz$6;->e:Lo/dgu$e;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 10

    .line 1617
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1618
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1619
    return-void

    .line 1622
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 1623
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1624
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1625
    return-void

    .line 1627
    :cond_1
    const/16 v0, 0x7533

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 1628
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 1629
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1630
    :cond_2
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1631
    return-void

    .line 1633
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 1634
    if-nez v7, :cond_4

    .line 1635
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiHealthData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1636
    return-void

    .line 1639
    :cond_4
    new-instance v8, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v8}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    .line 1641
    invoke-static {v7, v8}, Lo/dhh;->e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Ljava/lang/String;

    move-result-object v9

    .line 1642
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveDeviceType(I)V

    .line 1644
    if-nez v9, :cond_5

    .line 1645
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUrl is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1646
    return-void

    .line 1648
    :cond_5
    iget-object v0, p0, Lo/cvz$6;->e:Lo/dgu$e;

    iput-object v9, v0, Lo/dgu$e;->d:Ljava/lang/String;

    .line 1649
    iget-object v0, p0, Lo/cvz$6;->e:Lo/dgu$e;

    iput-object v8, v0, Lo/dgu$e;->c:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 1650
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoTrackDetailData is success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1651
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 1652
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lo/cvz$6;->e:Lo/dgu$e;

    iget-object v1, v1, Lo/dgu$e;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/cvz$6;->e:Lo/dgu$e;

    iget-object v2, v2, Lo/dgu$e;->c:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v1, v2}, Lo/cbl;->d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 1653
    return-void
.end method
