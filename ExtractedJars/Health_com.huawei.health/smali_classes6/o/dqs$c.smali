.class Lo/dqs$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# direct methods
.method private a(Landroid/os/Bundle;Ljava/util/ArrayList;)Lo/dqn;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Bundle;Ljava/util/ArrayList<Lcom/huawei/multisimservice/model/SimInfo;>;)Lo/dqn;"
        }
    .end annotation

    .line 807
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Get commonResult for download profile"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 809
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 810
    const-string v0, "AttachedDeviceManager"

    const-string v1, "GetCommonResultForDownloadProfile failed, bundle is null, RESULT_CODE_ERROR"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 811
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 813
    :cond_0
    new-instance v2, Lo/dqn;

    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    invoke-direct {v2, v1, v0, p2}, Lo/dqn;-><init>(IILjava/util/List;)V

    .line 814
    return-object v2
.end method

.method private a(Lo/dqm;Lo/dqn;)V
    .locals 5

    .line 762
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Start to excute doCallback() function"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 764
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 765
    :cond_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "doCallback() excute failed, callback or commonResult is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 766
    return-void

    .line 768
    :cond_1
    invoke-virtual {p1}, Lo/dqm;->e()Lo/dql;

    move-result-object v2

    .line 769
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 770
    const-string v0, "AttachedDeviceManager"

    const-string v1, "doCallback() excute failed, attachedDeviceManagerCallback is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 771
    return-void

    .line 773
    :cond_2
    invoke-virtual {p1}, Lo/dqm;->a()I

    move-result v0

    invoke-interface {v2, v0, p2}, Lo/dql;->d(ILo/dqn;)V

    .line 774
    invoke-static {}, Lo/dqs;->k()Ljava/util/ArrayList;

    move-result-object v3

    monitor-enter v3

    .line 775
    :try_start_0
    invoke-static {}, Lo/dqs;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 776
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 778
    :goto_0
    return-void
.end method

.method private b(Landroid/os/Bundle;)Lo/dqn;
    .locals 3

    .line 818
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Get commonResult for delete profile"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 820
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 821
    const-string v0, "AttachedDeviceManager"

    const-string v1, "GetCommonResultForDeleteProfile failed, bundle is null, RESULT_CODE_ERROR"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 822
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 824
    :cond_0
    new-instance v2, Lo/dqn;

    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    invoke-direct {v2, v1, v0}, Lo/dqn;-><init>(II)V

    .line 825
    return-object v2
.end method

.method private c(Landroid/os/Bundle;)Lo/dqn;
    .locals 5

    .line 787
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Start to get the commonResult for get device sim info"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 789
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 790
    const-string v0, "AttachedDeviceManager"

    const-string v1, "GetCommonResultForGetAttachedDeviceSimInfo failed, bundle is null, RESULT_CODE_ERROR"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 791
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 793
    :cond_0
    const-string v0, "deviceSimInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    .line 794
    instance-of v0, v3, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    if-eqz v0, :cond_1

    .line 795
    new-instance v2, Lo/dqn;

    move-object v0, v3

    check-cast v0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0}, Lo/dqn;-><init>(ILcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V

    goto :goto_0

    .line 797
    :cond_1
    const-string v0, "AttachedDeviceManager"

    const-string v1, "GetCommonResultForGetAttachedDeviceSimInfo error, can not change to MultiSimDeviceInfo."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 798
    new-instance v4, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v4}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    .line 799
    const/4 v0, -0x8

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setResultCode(I)V

    .line 800
    new-instance v2, Lo/dqn;

    const/4 v0, 0x0

    invoke-direct {v2, v0, v4}, Lo/dqn;-><init>(ILcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V

    .line 802
    :goto_0
    return-object v2
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 18

    .line 688
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AttachedDeviceMgrCallbackHandler handle message msg.what: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p1

    iget v2, v2, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 689
    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 690
    move-object/from16 v0, p1

    iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 691
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 698
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 700
    :sswitch_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Manager handle MSG, get device sim info callback."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 701
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lo/dqs$c;->c(Landroid/os/Bundle;)Lo/dqn;

    move-result-object v8

    .line 702
    const/4 v6, 0x0

    .line 703
    goto :goto_1

    .line 705
    :sswitch_1
    instance-of v0, v4, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 706
    move-object v9, v4

    check-cast v9, Ljava/util/ArrayList;

    .line 707
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/multisimservice/model/SimInfo;

    if-eqz v0, :cond_0

    .line 708
    move-object v5, v4

    check-cast v5, Ljava/util/ArrayList;

    .line 711
    :cond_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Manager handle MSG, download profile callback."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 712
    move-object/from16 v0, p0

    invoke-direct {v0, v3, v5}, Lo/dqs$c;->a(Landroid/os/Bundle;Ljava/util/ArrayList;)Lo/dqn;

    move-result-object v8

    .line 713
    const/4 v6, 0x2

    .line 714
    goto :goto_1

    .line 716
    :sswitch_2
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Manager handle MSG, delete profile callback."

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 717
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lo/dqs$c;->b(Landroid/os/Bundle;)Lo/dqn;

    move-result-object v8

    .line 718
    const/4 v6, 0x3

    .line 719
    goto :goto_1

    .line 721
    :goto_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "AttachedDeviceMgrCallbackHandler handle message error occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 722
    return-void

    .line 726
    :goto_1
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AttachedDeviceMgrCallbackHandler type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 730
    invoke-static {}, Lo/dqs;->b()Ljava/util/HashMap;

    move-result-object v11

    monitor-enter v11

    .line 731
    :try_start_0
    invoke-static {}, Lo/dqs;->b()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v7

    .line 732
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 733
    const-string v0, "AttachedDeviceManager"

    const-string v1, "start to do onInfoBack, return the result to the caller."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 734
    :cond_1
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 735
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 736
    instance-of v0, v10, Lo/dqm;

    if-eqz v0, :cond_1

    .line 737
    move-object v9, v10

    check-cast v9, Lo/dqm;

    .line 738
    invoke-virtual {v9}, Lo/dqm;->a()I

    move-result v0

    if-ne v6, v0, :cond_1

    .line 739
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v8}, Lo/dqs$c;->a(Lo/dqm;Lo/dqn;)V

    goto :goto_2

    .line 743
    :cond_2
    const-string v0, "AttachedDeviceManager"

    const-string v1, "handle complete, remove callback."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 744
    invoke-static {}, Lo/dqs;->k()Ljava/util/ArrayList;

    move-result-object v13

    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 745
    :try_start_1
    invoke-static {}, Lo/dqs;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dqm;

    .line 746
    invoke-static {}, Lo/dqs;->b()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 747
    invoke-static {}, Lo/dqs;->b()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    :cond_3
    goto :goto_3

    .line 750
    :cond_4
    invoke-static {}, Lo/dqs;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 751
    monitor-exit v13

    goto :goto_4

    :catchall_0
    move-exception v16

    monitor-exit v13

    :try_start_2
    throw v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 752
    :goto_4
    monitor-exit v11

    goto :goto_5

    :catchall_1
    move-exception v17

    monitor-exit v11

    throw v17

    .line 753
    :goto_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
