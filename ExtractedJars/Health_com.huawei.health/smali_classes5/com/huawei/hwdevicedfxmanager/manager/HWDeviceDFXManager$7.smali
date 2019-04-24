.class Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;
.super Lo/djv$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V
    .locals 0

    .line 551
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-direct {p0}, Lo/djv$d;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 671
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sleepITransferSleepAndDFXFileCallback() onFailure err_msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 673
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    goto :goto_0

    .line 675
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepITransferSleepAndDFXFileCallback() onFailure coreSleepCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    :goto_0
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 681
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sleepITransferSleepAndDFXFileCallback() onProgress progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 683
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onProgress(ILjava/lang/String;)V

    goto :goto_0

    .line 685
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepITransferSleepAndDFXFileCallback() onProgress coreSleepCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    :goto_0
    return-void
.end method

.method public onSuccess(ILjava/lang/String;Ljava/lang/String;)V
    .locals 36
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 555
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepITransferSleepAndDFXFileCallback() onSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "!!!!mTransferStateContentPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mTransferDataContentPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    if-nez p3, :cond_1

    .line 560
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTransferStateContentPath is null .callback failure. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const-string v1, "state path is null."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    goto/16 :goto_15

    .line 564
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepITransferSleepAndDFXFileCallback() onFailure coreSleepCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_15

    .line 568
    :cond_1
    const/4 v4, 0x0

    .line 569
    const/4 v5, 0x0

    .line 570
    const/4 v6, 0x0

    .line 571
    const/4 v7, 0x0

    .line 572
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 573
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 576
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v10

    .line 577
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "----------mTransferStateContent stateLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    move-object v4, v0

    .line 579
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v4}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    .line 580
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    move-object v8, v0

    .line 582
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_2

    .line 583
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v12

    .line 584
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "----------mTransferStateContent dataLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    move-object v5, v0

    .line 586
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v5}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v7, v0

    .line 587
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_e
    .catchall {:try_start_0 .. :try_end_0} :catchall_10

    move-object v9, v0

    .line 596
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 598
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_0

    .line 599
    :catch_0
    move-exception v10

    .line 600
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn1.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_0

    .line 602
    :catchall_0
    move-exception v14

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    throw v14

    .line 605
    :cond_3
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 607
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_1

    .line 608
    :catch_1
    move-exception v10

    .line 609
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn2.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_1

    .line 611
    :catchall_1
    move-exception v15

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    throw v15

    .line 615
    :cond_4
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 617
    :try_start_5
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_2

    .line 618
    :catch_2
    move-exception v10

    .line 619
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream1-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_2

    .line 621
    :catchall_2
    move-exception v16

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    throw v16

    .line 624
    :cond_5
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_13

    .line 626
    :try_start_7
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_3

    .line 627
    :catch_3
    move-exception v10

    .line 628
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream2-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_3

    .line 630
    :catchall_3
    move-exception v17

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    throw v17

    :goto_3
    goto/16 :goto_14

    .line 589
    :catch_4
    move-exception v10

    .line 590
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile() FileNotFoundException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_10

    .line 596
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 598
    :try_start_a
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_4

    .line 599
    :catch_5
    move-exception v10

    .line 600
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_b
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn1.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_4

    .line 602
    :catchall_4
    move-exception v18

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    throw v18

    .line 605
    :cond_6
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    .line 607
    :try_start_c
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_5

    .line 608
    :catch_6
    move-exception v10

    .line 609
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_d
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn2.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_5

    .line 611
    :catchall_5
    move-exception v19

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    throw v19

    .line 615
    :cond_7
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v6, :cond_8

    .line 617
    :try_start_e
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_6

    .line 618
    :catch_7
    move-exception v10

    .line 619
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_f
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream1-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_6

    .line 621
    :catchall_6
    move-exception v20

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    throw v20

    .line 624
    :cond_8
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v7, :cond_13

    .line 626
    :try_start_10
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_7

    .line 627
    :catch_8
    move-exception v10

    .line 628
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_11
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream2-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_7

    .line 630
    :catchall_7
    move-exception v21

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    throw v21

    :goto_7
    goto/16 :goto_14

    .line 591
    :catch_9
    move-exception v10

    .line 592
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_12
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile() IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    .line 596
    const/4 v0, 0x0

    if-eq v0, v4, :cond_9

    .line 598
    :try_start_13
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_a
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_8

    .line 599
    :catch_a
    move-exception v10

    .line 600
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_14
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn1.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_8

    .line 602
    :catchall_8
    move-exception v22

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    throw v22

    .line 605
    :cond_9
    :goto_8
    const/4 v0, 0x0

    if-eq v0, v5, :cond_a

    .line 607
    :try_start_15
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_b
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_9

    .line 608
    :catch_b
    move-exception v10

    .line 609
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_16
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn2.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_9

    .line 611
    :catchall_9
    move-exception v23

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    throw v23

    .line 615
    :cond_a
    :goto_9
    const/4 v0, 0x0

    if-eq v0, v6, :cond_b

    .line 617
    :try_start_17
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_c
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_a

    .line 618
    :catch_c
    move-exception v10

    .line 619
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_18
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream1-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_a

    .line 621
    :catchall_a
    move-exception v24

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    throw v24

    .line 624
    :cond_b
    :goto_a
    const/4 v0, 0x0

    if-eq v0, v7, :cond_13

    .line 626
    :try_start_19
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_d
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_b

    .line 627
    :catch_d
    move-exception v10

    .line 628
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_1a
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream2-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_b

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_b

    .line 630
    :catchall_b
    move-exception v25

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    throw v25

    :goto_b
    goto/16 :goto_14

    .line 593
    :catch_e
    move-exception v10

    .line 594
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_1b
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile() ClassNotFoundException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 596
    const/4 v0, 0x0

    if-eq v0, v4, :cond_c

    .line 598
    :try_start_1c
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_f
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_c

    .line 599
    :catch_f
    move-exception v10

    .line 600
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_1d
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn1.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_c

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_c

    .line 602
    :catchall_c
    move-exception v26

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    throw v26

    .line 605
    :cond_c
    :goto_c
    const/4 v0, 0x0

    if-eq v0, v5, :cond_d

    .line 607
    :try_start_1e
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_10
    .catchall {:try_start_1e .. :try_end_1e} :catchall_d

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_d

    .line 608
    :catch_10
    move-exception v10

    .line 609
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_1f
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn2.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_d

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_d

    .line 611
    :catchall_d
    move-exception v27

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    throw v27

    .line 615
    :cond_d
    :goto_d
    const/4 v0, 0x0

    if-eq v0, v6, :cond_e

    .line 617
    :try_start_20
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_11
    .catchall {:try_start_20 .. :try_end_20} :catchall_e

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_e

    .line 618
    :catch_11
    move-exception v10

    .line 619
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_21
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream1-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_e

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_e

    .line 621
    :catchall_e
    move-exception v28

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    throw v28

    .line 624
    :cond_e
    :goto_e
    const/4 v0, 0x0

    if-eq v0, v7, :cond_13

    .line 626
    :try_start_22
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->close()V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_12
    .catchall {:try_start_22 .. :try_end_22} :catchall_f

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_f

    .line 627
    :catch_12
    move-exception v10

    .line 628
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_23
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream2-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_f

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_f

    .line 630
    :catchall_f
    move-exception v29

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    throw v29

    :goto_f
    goto/16 :goto_14

    .line 596
    :catchall_10
    move-exception v30

    const/4 v0, 0x0

    if-eq v0, v4, :cond_f

    .line 598
    :try_start_24
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_24} :catch_13
    .catchall {:try_start_24 .. :try_end_24} :catchall_11

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_10

    .line 599
    :catch_13
    move-exception v31

    .line 600
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_25
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn1.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v31 .. v31}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_11

    .line 602
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    goto :goto_10

    .line 602
    :catchall_11
    move-exception v32

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    throw v32

    .line 605
    :cond_f
    :goto_10
    const/4 v0, 0x0

    if-eq v0, v5, :cond_10

    .line 607
    :try_start_26
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_14
    .catchall {:try_start_26 .. :try_end_26} :catchall_12

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_11

    .line 608
    :catch_14
    move-exception v31

    .line 609
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x2

    :try_start_27
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileIn2.close(),IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v31 .. v31}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_12

    .line 611
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto :goto_11

    .line 611
    :catchall_12
    move-exception v33

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException fileIn2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    throw v33

    .line 615
    :cond_10
    :goto_11
    const/4 v0, 0x0

    if-eq v0, v6, :cond_11

    .line 617
    :try_start_28
    invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_28} :catch_15
    .catchall {:try_start_28 .. :try_end_28} :catchall_13

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_12

    .line 618
    :catch_15
    move-exception v31

    .line 619
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_29
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream1-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v31 .. v31}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_13

    .line 621
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_12

    .line 621
    :catchall_13
    move-exception v34

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream1-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    throw v34

    .line 624
    :cond_11
    :goto_12
    const/4 v0, 0x0

    if-eq v0, v7, :cond_12

    .line 626
    :try_start_2a
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_2a .. :try_end_2a} :catch_16
    .catchall {:try_start_2a .. :try_end_2a} :catchall_14

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_13

    .line 627
    :catch_16
    move-exception v31

    .line 628
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    :try_start_2b
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException inputStream2-- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v31 .. v31}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_14

    .line 630
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    goto :goto_13

    .line 630
    :catchall_14
    move-exception v35

    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException inputStream2-- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    throw v35

    .line 633
    :cond_12
    :goto_13
    throw v30

    .line 636
    :cond_13
    :goto_14
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_14

    .line 637
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    move-result v10

    .line 638
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeleteDataSuc :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    move-result v10

    .line 641
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeleteStateSuc :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coreSleepData :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coreSleepStatus :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coreSleepData size =  :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coreSleepStatus size ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_16

    .line 648
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 649
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const-string v1, "status file size is 0."

    move/from16 v2, p1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    goto :goto_15

    .line 651
    :cond_15
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepITransferSleepAndDFXFileCallback() onFailure coreSleepCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_15

    .line 653
    :cond_16
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_17

    .line 655
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v9, v8}, Lo/dca;->e(ILjava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_15

    .line 658
    :cond_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v9, v8}, Lo/dca;->e(ILjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 660
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_18

    .line 661
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    move-result-object v0

    const-string v1, ""

    move/from16 v2, p1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onSuccess(ILjava/lang/String;)V

    goto :goto_15

    .line 663
    :cond_18
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepITransferSleepAndDFXFileCallback() onSuccess coreSleepCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    :goto_15
    return-void
.end method
