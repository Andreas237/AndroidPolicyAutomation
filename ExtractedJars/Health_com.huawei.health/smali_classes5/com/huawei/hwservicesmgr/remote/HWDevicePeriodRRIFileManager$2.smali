.class Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getPeriodRRIFileFromDevice()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 220
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$700(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Z

    move-result v4

    .line 221
    if-nez v4, :cond_0

    .line 223
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User do not pressure adjust."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    const v1, 0x186a2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z

    .line 225
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 226
    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$800(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)[I

    move-result-object v5

    .line 230
    const/4 v0, 0x0

    aget v6, v5, v0

    .line 231
    const/4 v0, 0x1

    aget v7, v5, v0

    .line 233
    if-lt v6, v7, :cond_1

    sub-int v0, v6, v7

    const/16 v1, 0x12c

    if-gt v0, v1, :cond_1

    .line 234
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "future time : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    add-int/lit8 v6, v7, -0x3d

    goto :goto_0

    .line 236
    :cond_1
    sub-int v0, v6, v7

    const/16 v1, 0x12c

    if-le v0, v1, :cond_2

    .line 237
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "future time : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    add-int/lit8 v6, v7, -0x3d

    .line 239
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    int-to-long v1, v6

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$400(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)V

    .line 242
    :cond_2
    :goto_0
    new-instance v8, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct {v8}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 243
    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 244
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 245
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 246
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setTaskType(I)V

    .line 247
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 248
    invoke-virtual {v8, v6}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setStartTime(I)V

    .line 249
    invoke-virtual {v8, v7}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setEndTime(I)V

    .line 251
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$900(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v9

    .line 252
    const/4 v0, 0x0

    if-ne v0, v9, :cond_3

    .line 253
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    const-string v1, "null == configManager"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$1000(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Ljava/lang/String;)V

    .line 254
    return-void

    .line 256
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$1100(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Lo/djv$d;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 257
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    const-string v1, "null == periodFileCallBack"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$1000(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Ljava/lang/String;)V

    .line 258
    return-void

    .line 260
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$1100(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Lo/djv$d;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Lo/dde;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V

    .line 261
    return-void
.end method
