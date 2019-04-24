.class Lo/dea$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dea;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dea;


# direct methods
.method constructor <init>(Lo/dea;)V
    .locals 0

    .line 2571
    iput-object p1, p0, Lo/dea$7;->c:Lo/dea;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;)V
    .locals 12

    .line 2573
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onBTDeviceBondNone()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2575
    iget-object v0, p0, Lo/dea$7;->c:Lo/dea;

    invoke-static {v0, p1}, Lo/dea;->e(Lo/dea;Ljava/lang/String;)I

    move-result v5

    .line 2576
    const/4 v0, -0x1

    if-eq v0, v5, :cond_3

    .line 2577
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to remove device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2578
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2580
    iget-object v0, p0, Lo/dea$7;->c:Lo/dea;

    invoke-static {v0}, Lo/dea;->e(Lo/dea;)Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    .line 2581
    :try_start_0
    iget-object v0, p0, Lo/dea$7;->c:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2582
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2583
    iget-object v0, p0, Lo/dea$7;->c:Lo/dea;

    invoke-static {v0, v9}, Lo/dea;->b(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v10

    .line 2584
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2585
    goto :goto_1

    :cond_0
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 2586
    monitor-exit v7

    return-void

    .line 2588
    :cond_1
    :goto_1
    goto :goto_0

    .line 2589
    :cond_2
    monitor-exit v7

    goto :goto_2

    :catchall_0
    move-exception v11

    monitor-exit v7

    throw v11

    .line 2590
    :goto_2
    iget-object v0, p0, Lo/dea$7;->c:Lo/dea;

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lo/dea;->c(Lo/dea;Ljava/util/List;Z)V

    .line 2592
    :cond_3
    return-void
.end method
