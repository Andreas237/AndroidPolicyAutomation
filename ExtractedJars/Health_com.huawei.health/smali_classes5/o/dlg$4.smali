.class Lo/dlg$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlg;


# direct methods
.method constructor <init>(Lo/dlg;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/dlg$4;->b:Lo/dlg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 86
    invoke-static {}, Lo/dlg;->b()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 87
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u8fdb\u5165\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 89
    monitor-exit v5

    return-void

    .line 91
    :cond_0
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "myCallback \u6587\u4ef6\u4f20\u8f93\u5b8c\u6bd5\uff0c\u5c06\u8fd4\u56de\u503c\u8fd4\u56de\u7ed9\u4e0a\u5c42 callbacks.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " callbacks.get(0).getType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v6, 0x0

    .line 95
    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getCallback()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/djv;

    .line 99
    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 102
    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 103
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u961f\u5217\u4e2d\u8fd8\u6709\u6570\u636e\uff0c\u7ee7\u7eed\u4f20\u8f93"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lo/dlg$4;->b:Lo/dlg;

    invoke-static {v0}, Lo/dlg;->d(Lo/dlg;)Lo/dlh;

    move-result-object v0

    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    iget-object v2, p0, Lo/dlg$4;->b:Lo/dlg;

    invoke-static {v2}, Lo/dlg;->c(Lo/dlg;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dlh;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 107
    :cond_1
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "myCallback \u6587\u4ef6\u4f20\u8f93\u5b8c\u6bd5\uff0c\u5c06\u8fd4\u56de\u503c\u8fd4\u56de\u7ed9\u4e0a\u5c42 callbacks.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dlg;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/dlg$4;->b:Lo/dlg;

    invoke-static {v0}, Lo/dlg;->b(Lo/dlg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 111
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 112
    const/16 v0, 0x2710

    if-ne v0, p1, :cond_2

    .line 114
    new-instance v8, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 115
    invoke-virtual {v8, v6}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 116
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 117
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject3(Ljava/lang/Object;)V

    .line 118
    iput-object v8, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 119
    const/4 v0, 0x0

    iput v0, v7, Landroid/os/Message;->what:I

    .line 120
    iput p1, v7, Landroid/os/Message;->arg1:I

    .line 121
    iget-object v0, p0, Lo/dlg$4;->b:Lo/dlg;

    invoke-static {v0}, Lo/dlg;->b(Lo/dlg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 122
    goto :goto_0

    :cond_2
    const v0, 0x1adb2

    if-ne v0, p1, :cond_3

    .line 123
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "110002\u95ed\u5408"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 125
    :cond_3
    new-instance v8, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 126
    invoke-virtual {v8, v6}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 127
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 128
    iput-object v8, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 129
    const/4 v0, 0x0

    iput v0, v7, Landroid/os/Message;->what:I

    .line 130
    iput p1, v7, Landroid/os/Message;->arg1:I

    .line 131
    iget-object v0, p0, Lo/dlg$4;->b:Lo/dlg;

    invoke-static {v0}, Lo/dlg;->b(Lo/dlg;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 134
    :cond_4
    :goto_0
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u9000\u51fa\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 136
    :goto_1
    return-void
.end method
