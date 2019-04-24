.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 2430
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 2433
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Genera onItemClick: parent = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",+view = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",+position = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v4, p3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "+idLong = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v4, p4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2436
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 2437
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 2438
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v0

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eoq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2439
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v8

    throw v9

    .line 2440
    :goto_0
    invoke-virtual {v6}, Lo/eoq;->c()I

    move-result v8

    .line 2441
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onItemClick: id = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2442
    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_1

    .line 2445
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2446
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2448
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c()V

    .line 2449
    goto/16 :goto_1

    .line 2452
    :sswitch_1
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/eos$b;

    .line 2453
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, v9, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2454
    goto/16 :goto_1

    .line 2457
    :sswitch_2
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/eos$b;

    .line 2458
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, v10, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2459
    goto/16 :goto_1

    .line 2461
    :sswitch_3
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/eos$b;

    .line 2462
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, v11, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2463
    goto/16 :goto_1

    .line 2465
    :sswitch_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Ljava/lang/Class;)V

    .line 2467
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iq:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2468
    goto/16 :goto_1

    .line 2470
    :sswitch_5
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/eos$b;

    .line 2471
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, v12, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2472
    goto/16 :goto_1

    .line 2475
    :sswitch_6
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/eos$b;

    .line 2476
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, v13, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2477
    goto/16 :goto_1

    .line 2479
    :sswitch_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2481
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ir:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2482
    goto/16 :goto_1

    .line 2486
    :sswitch_8
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "\u6765\u7535\u9759\u97f3"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2488
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->it:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2489
    goto/16 :goto_1

    .line 2491
    :sswitch_9
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startAlarmActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2493
    new-instance v0, Landroid/content/Intent;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v14, v0

    .line 2494
    const-string v0, "device_id"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2495
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0, v14}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 2497
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->io:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2498
    goto/16 :goto_1

    .line 2500
    :sswitch_a
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startNoDisturbSettingActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2502
    new-instance v0, Landroid/content/Intent;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v15, v0

    .line 2503
    const-string v0, "device_id"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2504
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x5

    invoke-virtual {v0, v15, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2506
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->im:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2507
    goto/16 :goto_1

    .line 2509
    :sswitch_b
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startNotificationSettingActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2511
    new-instance v0, Landroid/content/Intent;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v16, v0

    .line 2512
    const-string v0, "device_id"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2513
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 2515
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iF:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2516
    goto/16 :goto_1

    .line 2518
    :sswitch_c
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "openHuaweiAppStore"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2519
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2521
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->id:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2522
    goto/16 :goto_1

    .line 2524
    :sswitch_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->q(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2525
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gotoWallet"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2527
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ii:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2528
    goto/16 :goto_1

    .line 2530
    :sswitch_e
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gotoSimCard"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2531
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2533
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ij:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2534
    goto/16 :goto_1

    .line 2536
    :sswitch_f
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gotoMember"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2537
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2539
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ik:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2540
    goto/16 :goto_1

    .line 2543
    :sswitch_10
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startWeatherReportActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2544
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2546
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ip:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2547
    goto/16 :goto_1

    .line 2549
    :sswitch_11
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startActivity LeftRightHandSettingsActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2550
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    const/16 v2, 0x1a

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2551
    goto/16 :goto_1

    .line 2554
    :sswitch_12
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/eos$b;

    .line 2555
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, v17

    iget-object v1, v1, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2556
    goto/16 :goto_1

    .line 2558
    :sswitch_13
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startCoreSleepSelectorActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2559
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2561
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iG:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2562
    goto/16 :goto_1

    .line 2564
    :sswitch_14
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startIntelligentHomeLinkageActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2565
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/16 v2, 0x26

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2566
    goto/16 :goto_1

    .line 2568
    :sswitch_15
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startHeartRateEnable"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2569
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2570
    goto/16 :goto_1

    .line 2572
    :sswitch_16
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d()V

    .line 2573
    goto/16 :goto_1

    .line 2575
    :sswitch_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/enz;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/enz;->d(Ljava/lang/String;Landroid/os/Handler;)V

    .line 2577
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iv:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2578
    goto/16 :goto_1

    .line 2580
    :sswitch_18
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "OneLevelMenuManagerActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2582
    new-instance v0, Landroid/content/Intent;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v18, v0

    .line 2583
    const-string v0, "device_id"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2584
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 2585
    goto/16 :goto_1

    .line 2587
    :sswitch_19
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "call hotline"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2589
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iz:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2590
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2591
    goto/16 :goto_1

    .line 2593
    :sswitch_1a
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "WLAN UPDATE SWITCH"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2595
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/eos$b;

    .line 2596
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, v19

    iget-object v1, v1, Lo/eos$b;->b:Landroid/widget/Switch;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V

    .line 2597
    goto/16 :goto_1

    .line 2599
    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->v(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2600
    goto/16 :goto_1

    .line 2602
    :sswitch_1c
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter huawfen"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2603
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 2605
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iw:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2606
    goto/16 :goto_1

    .line 2608
    :sswitch_1d
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showFeedBackLogDialog."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2609
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2610
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    goto/16 :goto_1

    .line 2614
    :sswitch_1e
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start setting_about_beta_question"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2615
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2616
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    goto/16 :goto_1

    .line 2620
    :sswitch_1f
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start PressAutoMonitorActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2621
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    const/16 v2, 0x149

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2622
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iB:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2623
    goto/16 :goto_1

    .line 2625
    :sswitch_20
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start ContinueHeartRateSettingActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2626
    const-string v0, "itemOnclick"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2627
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;

    const/16 v2, 0x23

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2628
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->jj:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2629
    goto/16 :goto_1

    .line 2631
    :sswitch_21
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start AW70ModeSelectActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2634
    new-instance v20, Ljava/util/HashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    .line 2635
    const-string v0, "click"

    const-string v1, "1"

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2636
    sget-object v0, Lo/dae;->gb:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v21

    .line 2637
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object/from16 v2, v21

    move-object/from16 v3, v20

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2638
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save notification click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2640
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const-class v1, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    const/16 v2, 0x24

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/Class;I)V

    .line 2641
    goto :goto_1

    .line 2643
    :sswitch_22
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start ContinueHeartRateSettingActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2644
    new-instance v0, Landroid/content/Intent;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v22, v0

    .line 2645
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, v22

    const/16 v2, 0x25

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2646
    .line 2650
    :cond_1
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_6
        0x2 -> :sswitch_5
        0x3 -> :sswitch_8
        0x4 -> :sswitch_9
        0x5 -> :sswitch_a
        0x6 -> :sswitch_b
        0x7 -> :sswitch_10
        0xb -> :sswitch_1
        0xc -> :sswitch_4
        0xd -> :sswitch_16
        0xe -> :sswitch_17
        0xf -> :sswitch_12
        0x11 -> :sswitch_7
        0x12 -> :sswitch_c
        0x13 -> :sswitch_d
        0x14 -> :sswitch_f
        0x15 -> :sswitch_e
        0x17 -> :sswitch_13
        0x18 -> :sswitch_15
        0x19 -> :sswitch_2
        0x1a -> :sswitch_11
        0x1c -> :sswitch_18
        0x1d -> :sswitch_19
        0x1e -> :sswitch_1a
        0x1f -> :sswitch_1c
        0x20 -> :sswitch_1d
        0x21 -> :sswitch_1e
        0x23 -> :sswitch_20
        0x24 -> :sswitch_21
        0x25 -> :sswitch_22
        0x26 -> :sswitch_14
        0x27 -> :sswitch_3
        0x28 -> :sswitch_1b
        0x149 -> :sswitch_1f
    .end sparse-switch
.end method
