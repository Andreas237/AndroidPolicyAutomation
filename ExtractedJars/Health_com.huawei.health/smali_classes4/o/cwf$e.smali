.class Lo/cwf$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/cwf;


# direct methods
.method public constructor <init>(Lo/cwf;Landroid/os/Looper;)V
    .locals 0

    .line 1442
    iput-object p1, p0, Lo/cwf$e;->a:Lo/cwf;

    .line 1443
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1444
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1448
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1449
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_6

    .line 1451
    :pswitch_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "INSERT_EVENT_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1452
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/DBAlarmObject;

    .line 1453
    invoke-static {}, Lo/cwf;->k()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 1454
    :try_start_0
    invoke-virtual {v4}, Lcom/huawei/datatype/DBAlarmObject;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 1455
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/EventAlarmInfo;

    .line 1456
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INSERT_EVENT_ALARM eventAlarmInfos = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/datatype/EventAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1457
    goto :goto_0

    .line 1460
    :cond_0
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1461
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/cwf$e$5;

    invoke-direct {v1, p0, v4}, Lo/cwf$e$5;-><init>(Lo/cwf$e;Lcom/huawei/datatype/DBAlarmObject;)V

    invoke-virtual {v0, v6, v1}, Lo/dqi;->e(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1479
    :cond_1
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 1480
    :goto_1
    goto/16 :goto_6

    .line 1483
    :pswitch_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DELETE_EVENT_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1484
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1486
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/EventAlarmInfo;

    .line 1487
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE_EVENT_ALARM eventAlarmInfos = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1488
    goto :goto_2

    .line 1494
    :cond_2
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1495
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/cwf$e$3;

    invoke-direct {v1, p0}, Lo/cwf$e$3;-><init>(Lo/cwf$e;)V

    invoke-virtual {v0, v4, v1}, Lo/dqi;->e(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_6

    .line 1505
    :pswitch_2
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_EVENT_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1506
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1507
    invoke-static {}, Lo/cwf;->k()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 1508
    :try_start_1
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/cwf$e$2;

    invoke-direct {v1, p0, v4}, Lo/cwf$e$2;-><init>(Lo/cwf$e;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1519
    monitor-exit v5

    goto :goto_3

    :catchall_1
    move-exception v10

    monitor-exit v5

    throw v10

    .line 1520
    :goto_3
    goto/16 :goto_6

    .line 1523
    :pswitch_3
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "INSERT_SMART_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1524
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/DBAlarmObject;

    .line 1525
    invoke-virtual {v4}, Lcom/huawei/datatype/DBAlarmObject;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 1526
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 1527
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INSERT_SMART_ALARM smartAlarmInfoList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/datatype/SmartAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1528
    goto :goto_4

    .line 1532
    :cond_3
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1533
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/cwf$e$1;

    invoke-direct {v1, p0, v4}, Lo/cwf$e$1;-><init>(Lo/cwf$e;Lcom/huawei/datatype/DBAlarmObject;)V

    invoke-virtual {v0, v5, v1}, Lo/dqi;->a(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_6

    .line 1554
    :pswitch_4
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DELETE_SMART_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1555
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1556
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 1557
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE_SMART_ALARM eventAlarmInfos = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1558
    goto :goto_5

    .line 1561
    :cond_4
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1562
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/cwf$e$4;

    invoke-direct {v1, p0}, Lo/cwf$e$4;-><init>(Lo/cwf$e;)V

    invoke-virtual {v0, v4, v1}, Lo/dqi;->a(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_6

    .line 1572
    :pswitch_5
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_SMART_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1573
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1575
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->h(Lo/cwf;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/cwf$e$8;

    invoke-direct {v1, p0, v4}, Lo/cwf$e$8;-><init>(Lo/cwf$e;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1589
    goto :goto_6

    .line 1592
    :pswitch_6
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_SMART_TIMEOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1593
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->g(Lo/cwf;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1594
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->g(Lo/cwf;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1596
    :cond_5
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->f(Lo/cwf;)I

    .line 1597
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v3}, Lo/cwf;->k(Lo/cwf;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->k(Lo/cwf;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_6

    .line 1599
    iget-object v0, p0, Lo/cwf$e;->a:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->i(Lo/cwf;)V

    .line 1606
    :cond_6
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
