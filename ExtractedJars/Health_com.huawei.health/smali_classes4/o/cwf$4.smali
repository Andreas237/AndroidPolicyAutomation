.class Lo/cwf$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwf;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:Z

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Lo/cwf;


# direct methods
.method constructor <init>(Lo/cwf;Ljava/util/List;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 572
    iput-object p1, p0, Lo/cwf$4;->e:Lo/cwf;

    iput-object p2, p0, Lo/cwf$4;->d:Ljava/util/List;

    iput-boolean p3, p0, Lo/cwf$4;->b:Z

    iput-object p4, p0, Lo/cwf$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 14

    .line 575
    move-object/from16 v5, p2

    check-cast v5, Ljava/util/List;

    .line 576
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 577
    iget-object v0, p0, Lo/cwf$4;->e:Lo/cwf;

    invoke-static {v0, v5}, Lo/cwf;->a(Lo/cwf;Ljava/util/List;)V

    .line 580
    :cond_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSmartAlarm() before smartAlarmInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    iget-object v0, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 582
    iget-object v0, p0, Lo/cwf$4;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 583
    iget-object v0, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 584
    iget-object v0, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 586
    :cond_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSmartAlarm() after smartAlarmInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 589
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 590
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 591
    iget-object v0, p0, Lo/cwf$4;->e:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->d(Lo/cwf;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 592
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSmartAlarm mCurrentDeviceId  =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/cwf$4;->e:Lo/cwf;

    invoke-static {v4}, Lo/cwf;->d(Lo/cwf;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    iget-object v0, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v7, v0, 0x12

    .line 597
    const/16 v0, 0xff

    if-ge v0, v7, :cond_2

    .line 598
    add-int/lit8 v0, v7, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 599
    invoke-static {v7}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v9

    goto :goto_0

    .line 601
    :cond_2
    add-int/lit8 v0, v7, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 602
    invoke-static {v7}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v9

    .line 605
    :goto_0
    const/16 v0, -0x7f

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 607
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 609
    iget-object v0, p0, Lo/cwf$4;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 612
    const/16 v0, -0x7e

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 614
    const/16 v0, 0x10

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 617
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 619
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 626
    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 629
    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 631
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 633
    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 635
    iget-object v0, p0, Lo/cwf$4;->e:Lo/cwf;

    invoke-static {v0, v11}, Lo/cwf;->c(Lo/cwf;Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v12

    .line 636
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5355\u6b21\u667a\u80fd\u95f9\u949f enable  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 638
    const/4 v0, 0x0

    if-ne v0, v12, :cond_3

    .line 639
    invoke-virtual {v11, v12}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 642
    :cond_3
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u667a\u80fd\u95f9\u949f\u72b6\u6001 enable  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 647
    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 649
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 651
    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 654
    const/4 v0, 0x6

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 656
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 658
    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 661
    const/4 v0, 0x7

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 663
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 665
    invoke-virtual {v11}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 666
    goto/16 :goto_1

    .line 668
    :cond_4
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 669
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 671
    iget-object v0, p0, Lo/cwf$4;->e:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->b(Lo/cwf;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 673
    iget-boolean v0, p0, Lo/cwf$4;->b:Z

    if-eqz v0, :cond_5

    .line 674
    invoke-static {}, Lo/cwf;->c()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10

    .line 675
    :try_start_0
    invoke-static {}, Lo/cwf;->d()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/cwf$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 676
    monitor-exit v10

    goto :goto_2

    :catchall_0
    move-exception v13

    monitor-exit v10

    throw v13

    .line 677
    :goto_2
    iget-object v0, p0, Lo/cwf$4;->e:Lo/cwf;

    iget-object v1, p0, Lo/cwf$4;->d:Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cwf;->b(Lo/cwf;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_3

    .line 680
    :cond_5
    iget-object v0, p0, Lo/cwf$4;->e:Lo/cwf;

    iget-object v1, p0, Lo/cwf$4;->d:Ljava/util/List;

    iget-object v2, p0, Lo/cwf$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v2}, Lo/cwf;->b(Lo/cwf;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 682
    :goto_3
    return-void
.end method
