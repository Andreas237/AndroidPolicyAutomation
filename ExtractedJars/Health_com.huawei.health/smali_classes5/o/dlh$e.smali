.class Lo/dlh$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/dlh;


# direct methods
.method public constructor <init>(Lo/dlh;Landroid/os/Looper;)V
    .locals 0

    .line 770
    iput-object p1, p0, Lo/dlh$e;->a:Lo/dlh;

    .line 771
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 772
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 775
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 776
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x9

    if-eq v1, v0, :cond_0

    .line 777
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DFXAndSleepHandle handleMessage msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    :cond_0
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 784
    :sswitch_0
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->c(Lo/dlh;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->c(Lo/dlh;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 785
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    iget-object v1, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v1}, Lo/dlh;->c(Lo/dlh;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dlh;->d(Lo/dlh;Ljava/lang/String;)Ljava/lang/String;

    .line 786
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start querySleepOrDFXFileInformation fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v3}, Lo/dlh;->b(Lo/dlh;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dlh;->b(Lo/dlh;I)I

    .line 788
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    iget-object v1, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v1}, Lo/dlh;->b(Lo/dlh;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dlh;->b(Lo/dlh;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 790
    :cond_1
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v7

    .line 792
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->e()V

    .line 793
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->onDestroyMaintenance()V

    .line 795
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 796
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 797
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "!!dataPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v3}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v3

    invoke-interface {v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    new-instance v8, Lo/dkb;

    invoke-direct {v8}, Lo/dkb;-><init>()V

    .line 800
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dkb;->e(Ljava/lang/String;)V

    .line 801
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getmTransferStateContentPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dkb;->d(Ljava/lang/String;)V

    .line 802
    const/16 v0, 0x2710

    invoke-interface {v7, v0, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 803
    goto :goto_0

    .line 804
    :cond_2
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 806
    :goto_0
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenance success  ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    goto/16 :goto_2

    .line 811
    :sswitch_1
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->k(Lo/dlh;)I

    .line 812
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->i(Lo/dlh;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 813
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5927\u4e8e3\u6b21\u5931\u8d25 reTransforTime = 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 814
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->e()V

    .line 815
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 816
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v1}, Lo/dlh;->h(Lo/dlh;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 819
    :cond_3
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenanceCallback is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    :goto_1
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 822
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto/16 :goto_2

    .line 825
    :cond_4
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 826
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e22\u5305\u91cd\u53d1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->b()V

    .line 828
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v1}, Lo/dlh;->f(Lo/dlh;)I

    move-result v1

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_2

    .line 833
    :sswitch_2
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data transfer time out ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->e()V

    .line 835
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 836
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 837
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "30s timeout"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 839
    :cond_5
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenanceCallback is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    goto/16 :goto_2

    .line 843
    :sswitch_3
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getErrorCode([B)[I

    move-result-object v6

    .line 845
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v6}, Lo/dlh;->a(Lo/dlh;Ljava/lang/Object;)V

    .line 846
    goto/16 :goto_2

    .line 848
    :sswitch_4
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 849
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 851
    :cond_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v7, v0

    check-cast v7, [B

    .line 852
    array-length v0, v7

    const/16 v1, 0x8

    if-ne v1, v0, :cond_a

    const/4 v0, 0x2

    aget-byte v0, v7, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_a

    .line 854
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v7}, Lo/dlh;->c(Lo/dlh;[B)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 855
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is LEO return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    iget-object v1, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v1}, Lo/dlh;->p(Lo/dlh;)Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getIsUploadAppLog()I

    move-result v1

    invoke-static {v0, v1}, Lo/dlh;->c(Lo/dlh;I)I

    .line 860
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_trigger_beta_log_time"

    .line 861
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 860
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 863
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->c()V

    .line 865
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 866
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    const-wide/32 v2, 0x927c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 869
    :cond_7
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isgetlog_from_aboutactivity  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v3}, Lo/dlh;->l(Lo/dlh;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->l(Lo/dlh;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 871
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 872
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is LEO return  callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const v1, 0x1adb2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 877
    :cond_8
    return-void

    .line 880
    :cond_9
    :try_start_1
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->e()V

    .line 881
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 882
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->onDestroyMaintenance()V

    .line 883
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 886
    :cond_a
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetFileName([B)Ljava/util/ArrayList;

    move-result-object v6

    .line 887
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v6}, Lo/dlh;->b(Lo/dlh;Ljava/lang/Object;)V

    .line 889
    goto/16 :goto_2

    .line 891
    :sswitch_5
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 892
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 894
    :cond_b
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetMaintParameters([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    move-result-object v6

    .line 895
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v6}, Lo/dlh;->c(Lo/dlh;Ljava/lang/Object;)V

    .line 896
    goto/16 :goto_2

    .line 898
    :sswitch_6
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 899
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 901
    :cond_c
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v8, v0

    check-cast v8, [B

    .line 902
    array-length v0, v8

    const/16 v1, 0x8

    if-ne v1, v0, :cond_d

    const/4 v0, 0x2

    aget-byte v0, v8, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_d

    .line 903
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-virtual {v0}, Lo/dlh;->e()V

    .line 904
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 905
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->onDestroyMaintenance()V

    .line 906
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v8}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 909
    :cond_d
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unQueryFileInformation([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    move-result-object v6

    .line 910
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v6}, Lo/dlh;->e(Lo/dlh;Ljava/lang/Object;)V

    .line 912
    goto :goto_2

    .line 914
    :sswitch_7
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getAckCodeExt([B)[I

    move-result-object v6

    .line 916
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v6}, Lo/dlh;->d(Lo/dlh;Ljava/lang/Object;)V

    .line 917
    goto :goto_2

    .line 919
    :sswitch_8
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unApplyDataFromDevice([B)Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    move-result-object v6

    .line 920
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v6}, Lo/dlh;->k(Lo/dlh;Ljava/lang/Object;)V

    .line 921
    goto :goto_2

    .line 924
    :sswitch_9
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 925
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0}, Lo/dlh;->e(Lo/dlh;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 927
    :cond_e
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v9, v0

    check-cast v9, [B

    .line 928
    iget-object v0, p0, Lo/dlh$e;->a:Lo/dlh;

    invoke-static {v0, v9}, Lo/dlh;->b(Lo/dlh;[B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 929
    .line 935
    :cond_f
    :goto_2
    goto :goto_3

    .line 933
    :catch_0
    move-exception v7

    .line 934
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() Exception e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 936
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_4
        0x2 -> :sswitch_5
        0x3 -> :sswitch_6
        0x4 -> :sswitch_7
        0x5 -> :sswitch_8
        0x7 -> :sswitch_1
        0xa -> :sswitch_0
        0xb -> :sswitch_9
        0xf -> :sswitch_2
        0x7f -> :sswitch_3
    .end sparse-switch
.end method
