.class Lo/dlg$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 161
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 162
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 166
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 167
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/TransferTaskInfo;

    .line 168
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 171
    :sswitch_0
    :try_start_0
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject1()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/djv;

    .line 172
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 173
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b\u8fd4\u56de"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_0

    .line 175
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v5, v0, v1, v2}, Lo/djv;->onSuccess(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 177
    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lo/djv;->onFailure(ILjava/lang/String;)V

    goto :goto_0

    .line 180
    :cond_1
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b\u8fd4\u56de dfxCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    :goto_0
    goto :goto_1

    .line 182
    :catch_0
    move-exception v5

    .line 183
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u53ef\u7ef4\u53ef\u6d4b\u8fd4\u56de \u5f02\u5e38 e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    .line 189
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
