.class Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LogThread"
.end annotation


# instance fields
.field private exception:Z

.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;


# direct methods
.method private constructor <init>(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)V
    .locals 1

    .line 593
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 594
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->exception:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;)V
    .locals 0

    .line 593
    invoke-direct {p0, p1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;-><init>(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 666
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Z)Z

    .line 667
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 668
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V

    .line 670
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$100(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/io/FileOutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->valid()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 671
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$100(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/io/FileOutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 675
    :cond_1
    goto :goto_0

    .line 673
    :catch_0
    move-exception v4

    .line 674
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$302(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;

    .line 677
    invoke-super {p0}, Ljava/lang/Thread;->destroy()V

    .line 678
    return-void
.end method

.method public declared-synchronized run()V
    .locals 7

    monitor-enter p0

    .line 606
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "run isWrite"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    const/4 v4, 0x0

    .line 608
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 609
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->exception:Z

    .line 610
    const/4 v5, 0x0

    .line 611
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 612
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->initMaintenanceFile()V

    .line 613
    add-int/lit8 v4, v4, 0x1

    .line 614
    const/16 v0, 0xc8

    if-le v4, v0, :cond_6

    .line 615
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "Failed"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 616
    goto/16 :goto_5

    .line 620
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$500(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 622
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$602(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 623
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 624
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$600(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 625
    const/4 v4, 0x0

    .line 637
    :cond_1
    goto :goto_1

    .line 627
    :catch_0
    move-exception v6

    .line 628
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->exception:Z

    .line 631
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->initMaintenanceFile()V

    .line 632
    add-int/lit8 v4, v4, 0x1

    .line 633
    const/16 v0, 0xc8

    if-le v4, v0, :cond_2

    .line 634
    const/4 v4, 0x0

    .line 635
    goto :goto_2

    .line 637
    :cond_2
    goto/16 :goto_1

    .line 639
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->maintLogs2:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 640
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$702(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;J)J

    .line 641
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 643
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->exception:Z

    if-eqz v0, :cond_4

    .line 644
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_3

    .line 646
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "Failed"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 651
    :cond_5
    :goto_3
    const/4 v4, 0x0

    .line 652
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 655
    goto :goto_4

    .line 653
    :catch_1
    move-exception v6

    .line 654
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 657
    :cond_6
    :goto_4
    goto/16 :goto_0

    .line 658
    :cond_7
    :goto_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public declared-synchronized start()V
    .locals 3

    monitor-enter p0

    .line 598
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$100(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/io/FileOutputStream;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 599
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->initMaintenanceFile()V

    .line 601
    :cond_0
    invoke-super {p0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 602
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method
